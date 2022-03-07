package com.gmail.clevergoods.weather.framework.db

import com.gmail.clevergoods.weatheragregator.data.CurrentCityDataSource
import com.gmail.clevergoods.weatheragregator.domain.City

class InMemoryCurrentCityDataSource : CurrentCityDataSource {
    private var currentCity: City = City.EMPTY

    override fun setCurrentCity(city: City) {
       currentCity = city
    }

    override fun getCurrentCity() = currentCity
}
