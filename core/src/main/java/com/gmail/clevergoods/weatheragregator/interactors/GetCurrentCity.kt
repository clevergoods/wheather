package com.gmail.clevergoods.weatheragregator.interactors

import com.gmail.clevergoods.weatheragregator.data.CityRepository

class GetCurrentCity(private val cityRepository: CityRepository) {
    operator fun invoke() = cityRepository.getCurrentCity()
}