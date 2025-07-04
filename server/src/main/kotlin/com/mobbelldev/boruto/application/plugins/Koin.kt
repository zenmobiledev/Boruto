package com.mobbelldev.boruto.application.plugins

import com.mobbelldev.boruto.di.koinModule
import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(plugin = Koin) {
        slf4jLogger()
        modules(modules = koinModule)
    }
}