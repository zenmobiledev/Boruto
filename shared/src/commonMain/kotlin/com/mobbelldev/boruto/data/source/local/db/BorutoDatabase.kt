package com.mobbelldev.boruto.data.source.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mobbelldev.boruto.data.source.local.DatabaseConverter
import com.mobbelldev.boruto.data.source.local.dao.HeroDao
import com.mobbelldev.boruto.data.source.local.dao.HeroRemoteKeyDao
import com.mobbelldev.boruto.data.source.local.entity.HeroEntity
import com.mobbelldev.boruto.data.source.local.entity.HeroRemoteKeyEntity

@Database(entities = [HeroEntity::class, HeroRemoteKeyEntity::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}