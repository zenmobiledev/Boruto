package com.mobbelldev.boruto.di

import com.mobbelldev.boruto.data.repository.HeroRepositoryImpl
import com.mobbelldev.boruto.domain.repository.HeroRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val koinModule: Module = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}