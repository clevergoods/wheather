package com.gmail.clevergoods.weatheragregator.data

import com.gmail.clevergoods.weatheragregator.domain.City

interface CityDataSource {
    suspend fun add(city: City)

    suspend fun readAll(): List<City>

    suspend fun remove(city: City)
}