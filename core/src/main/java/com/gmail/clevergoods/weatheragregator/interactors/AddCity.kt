package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.CityRepository
import com.gmail.clevergoods.weatheragregator.domain.City

class AddCity(private val cityRepository: CityRepository) {
    suspend operator fun invoke(city: City) =
        cityRepository.addCity(city)
}