package com.gmail.clevergoods.weatheragregator.data

import com.gmail.clevergoods.weatheragregator.domain.City

class CityRepository (
    private val cityDataSource: CityDataSource,
    private val currentCityDataSource: CurrentCityDataSource) {

        suspend fun addCity(city: City) = cityDataSource.add(city)

        suspend fun getCities() = cityDataSource.readAll()

        suspend fun removeDocument(city: City) = cityDataSource.remove(city)

        fun setCurrentCity(city: City) = currentCityDataSource.setCurrentCity(city)

        fun getCurrentCity() = currentCityDataSource.getCurrentCity()
}