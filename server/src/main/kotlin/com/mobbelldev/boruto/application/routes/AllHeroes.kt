package com.mobbelldev.boruto.application.routes

import com.mobbelldev.boruto.data.model.response.ApiResponse
import com.mobbelldev.boruto.domain.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.application
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.getAllHeroes() {
    val repository: HeroRepository by application.inject()

    get(path = "/boruto/heroes") {
        try {
            val page: Int = call.request.queryParameters["page"]?.toInt() ?: 1
            require(value = page in 1..5)

            val response: ApiResponse = repository.getAllHeroes(
                page = page
            )
            call.respond(
                status = HttpStatusCode.OK,
                message = response
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
                status = HttpStatusCode.NotFound,
                message = ApiResponse(
                    success = false,
                    message = "Heroes not found."
                )
            )
        }
    }
}