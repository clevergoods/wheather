package com.gmail.clevergoods.weatheragregator.data

import com.gmail.clevergoods.weatheragregator.domain.City
import com.gmail.clevergoods.weatheragregator.domain.Weather

class WeatherRepository(private val dataSource: WeatherDataSource) {
    suspend fun addWeather(city: City, weather: Weather) =
        dataSource.add(city, weather)

    suspend fun getWeathers(city: City) = dataSource.read(city)

    suspend fun removeWeather(city: City, weather: Weather) =
        dataSource.remove(city, weather)

    suspend fun removeWeathers(city: City) =
        dataSource.removeAll(city)
}