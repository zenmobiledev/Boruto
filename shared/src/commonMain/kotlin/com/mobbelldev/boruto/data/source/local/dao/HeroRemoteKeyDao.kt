package com.mobbelldev.boruto.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.mobbelldev.boruto.data.source.local.entity.HeroRemoteKeyEntity

@Dao
interface HeroRemoteKeyDao {
    @Query("SELECT * FROM hero_remote_key_table WHERE id = :id")
    fun getRemoteKey(id: Int): HeroRemoteKeyEntity
}