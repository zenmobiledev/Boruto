package com.mobbelldev.boruto

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args = args)

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }

        get("/heroes/") {
            val name = call.queryParameters["name"]
            call.respondText(
                text = "Hello $name",
                status = HttpStatusCode.OK
            )
        }
    }
}