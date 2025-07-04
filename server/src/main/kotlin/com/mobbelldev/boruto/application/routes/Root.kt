package com.mobbelldev.boruto.application.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.root() {
    get(path = "/") {
        call.respond(
            status = HttpStatusCode.OK,
            message = "Welcome to Boruto API!"
        )
    }
}