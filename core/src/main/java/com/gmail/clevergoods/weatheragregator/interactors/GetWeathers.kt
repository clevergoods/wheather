package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.WeatherRepository
import com.gmail.clevergoods.weatheragregator.domain.City

class GetWeathers(private val weatherRepository: WeatherRepository) {

    suspend operator fun invoke(city: City) = weatherRepository.getWeathers(city)
}