package com.mobbelldev.boruto.application

import com.mobbelldev.boruto.application.plugins.configureDefaultHeader
import com.mobbelldev.boruto.application.plugins.configureKoin
import com.mobbelldev.boruto.application.plugins.configureMonitoring
import com.mobbelldev.boruto.application.plugins.configureRouting
import com.mobbelldev.boruto.application.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>): Unit = EngineMain.main(args = args)

fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
}