package com.gmail.clevergoods.weatheragregator.data

import com.gmail.clevergoods.weatheragregator.domain.City
import com.gmail.clevergoods.weatheragregator.domain.Weather

interface WeatherDataSource {
    suspend fun add(city: City, weather: Weather)

    suspend fun read(city: City): List<Weather>

    suspend fun remove(city: City, weather: Weather)

    suspend fun removeAll(city: City)
}