package com.gmail.clevergoods.weatheragregator.data

import com.gmail.clevergoods.weatheragregator.domain.City

interface CurrentCityDataSource {
    fun setCurrentCity(city: City)

    fun getCurrentCity(): City
}