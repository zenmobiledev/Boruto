package com.mobbelldev.boruto

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform