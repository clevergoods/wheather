package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.CityRepository
import com.gmail.clevergoods.weatheragregator.domain.City

class SetCurrentCity (private val cityRepository: CityRepository) {
    operator fun invoke(city: City) = cityRepository.setCurrentCity(city)
}