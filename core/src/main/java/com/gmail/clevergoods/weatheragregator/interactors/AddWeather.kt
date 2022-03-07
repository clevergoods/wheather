package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.WeatherRepository
import com.gmail.clevergoods.weatheragregator.domain.City
import com.gmail.clevergoods.weatheragregator.domain.Weather

class AddWeather(private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(city: City, weather: Weather) =
        weatherRepository.addWeather(city, weather)
}