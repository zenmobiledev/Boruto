package com.mobbelldev.boruto.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mobbelldev.boruto.util.Constants.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKeyEntity(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val prevPage: Int?,
    val nextPage: Int?,
)
