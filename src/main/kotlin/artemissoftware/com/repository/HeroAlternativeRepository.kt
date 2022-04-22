package artemissoftware.com.repository

import artemissoftware.com.models.ApiResponse
import artemissoftware.com.models.Hero

interface HeroAlternativeRepository {

    val heroes: List<Hero>

    suspend fun getAllHeroes(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}