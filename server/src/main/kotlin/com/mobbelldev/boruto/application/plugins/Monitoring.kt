package com.mobbelldev.boruto.application.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.calllogging.CallLogging

fun Application.configureMonitoring() {
    install(plugin = CallLogging)
}