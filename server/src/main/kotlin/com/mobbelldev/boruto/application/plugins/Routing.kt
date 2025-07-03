package com.mobbelldev.boruto.application.plugins

import com.mobbelldev.boruto.Greeting
import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        get(path = "/") {
            call.respondText(text = "Ktor: ${Greeting().greet()}")
        }
    }
}