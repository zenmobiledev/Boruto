package com.mobbelldev.boruto.data.source.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.mobbelldev.boruto.data.source.local.entity.HeroEntity

@Dao
interface HeroDao {
    @Query(value = "SELECT * FROM hero_table ORDER BY id ASC")
    fun getAllHeroes(): PagingSource<Int, HeroEntity>
}