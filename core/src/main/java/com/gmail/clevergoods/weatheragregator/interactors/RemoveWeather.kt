package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.WeatherRepository
import com.gmail.clevergoods.weatheragregator.domain.City
import com.gmail.clevergoods.weatheragregator.domain.Weather

class RemoveWeather(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(city: City, weather: Weather) = weatherRepository
        .removeWeather(city, weather)
}