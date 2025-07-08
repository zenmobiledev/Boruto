package com.mobbelldev.boruto.domain.repository

import com.mobbelldev.boruto.data.model.Hero
import com.mobbelldev.boruto.data.model.response.ApiResponse

interface HeroRepository {
    val heroes: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): ApiResponse

    suspend fun searchHeroes(name: String?): ApiResponse
}