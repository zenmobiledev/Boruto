package com.mobbelldev.boruto.application.routes

import com.mobbelldev.boruto.data.model.response.ApiResponse
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.getAllHeroes() {
    get(path = "/boruto/heroes") {
        try {
            val page: Int = call.request.queryParameters["page"]?.toInt() ?: 1

            require(value = page in 1..5)
            call.respond(
                status = HttpStatusCode.OK,
                message = page
            )
        } catch (_: NumberFormatException) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(
                    success = false,
                    message = "Only number allowed."
                )
            )
        } catch (_: IllegalArgumentException) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(
                    success = false,
                    message = "Heroes not found."
                )
            )
        }
    }
}