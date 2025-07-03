package com.mobbelldev.boruto.application.plugins

import io.ktor.http.HttpHeaders
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.defaultheaders.DefaultHeaders
import io.netty.handler.codec.DefaultHeaders
import java.time.Duration

fun Application.configureDefaultHeader() {
    install(plugin = DefaultHeaders) {
        val oneYearInSeconds: Long = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}