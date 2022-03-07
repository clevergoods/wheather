package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.CityRepository
import com.gmail.clevergoods.weatheragregator.data.WeatherRepository
import com.gmail.clevergoods.weatheragregator.domain.City

class GetCities(private val cityRepository: CityRepository) {

    suspend operator fun invoke() = cityRepository.getCities()
}