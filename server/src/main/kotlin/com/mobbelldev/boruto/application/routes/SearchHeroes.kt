package com.mobbelldev.boruto.application.routes

import com.mobbelldev.boruto.domain.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.application
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val repository: HeroRepository by application.inject()

    get(path = "/boruto/heroes/search") {
        val name = call.request.queryParameters["name"]

        val response = repository.searchHeroes(name = name)
        call.respond(
            status = HttpStatusCode.OK,
            message = response
        )
    }
}