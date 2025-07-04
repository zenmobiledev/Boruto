package com.mobbelldev.boruto.application.plugins

import com.mobbelldev.boruto.application.routes.getAllHeroes
import com.mobbelldev.boruto.application.routes.root
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}