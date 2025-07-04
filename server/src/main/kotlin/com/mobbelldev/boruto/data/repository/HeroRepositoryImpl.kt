package com.mobbelldev.boruto.data.repository

import com.mobbelldev.boruto.data.model.Hero
import com.mobbelldev.boruto.data.model.response.ApiResponse
import com.mobbelldev.boruto.domain.repository.HeroRepository

class HeroRepositoryImpl: HeroRepository {
    override val heroes: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val page1: List<Hero>
        get() = TODO("Not yet implemented")
    override val page2: List<Hero>
        get() = TODO("Not yet implemented")
    override val page3: List<Hero>
        get() = TODO("Not yet implemented")
    override val page4: List<Hero>
        get() = TODO("Not yet implemented")
    override val page5: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}