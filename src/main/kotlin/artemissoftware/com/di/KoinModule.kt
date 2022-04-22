package artemissoftware.com.di

import artemissoftware.com.repository.HeroAlternativeRepository
import artemissoftware.com.repository.HeroAlternativeRepositoryImpl
import artemissoftware.com.repository.HeroRepository
import artemissoftware.com.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
    single<HeroAlternativeRepository> {
        HeroAlternativeRepositoryImpl()
    }
}