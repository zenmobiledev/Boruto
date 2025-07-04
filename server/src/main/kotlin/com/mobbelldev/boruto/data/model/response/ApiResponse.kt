package com.mobbelldev.boruto.data.model.response

import com.mobbelldev.boruto.data.model.Hero
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: String,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList(),
)