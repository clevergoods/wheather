package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.CityRepository
import com.gmail.clevergoods.weatheragregator.data.WeatherRepository
import com.gmail.clevergoods.weatheragregator.domain.City

class RemoveCity(private val cityRepository: CityRepository, private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(city: City){
        weatherRepository.removeWeathers(city)
        if(weatherRepository.getWeathers(city).isNullOrEmpty()) {
            cityRepository.removeDocument(city)
        }
    }
}