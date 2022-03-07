package com.gmail.clevergoods.weather.framework

import android.content.Context
import com.gmail.clevergoods.weatheragregator.data.CityDataSource
import com.gmail.clevergoods.weatheragregator.domain.City
import com.raywenderlich.android.majesticreader.framework.db.CityEntity
import com.raywenderlich.android.majesticreader.framework.db.WeatherDatabase

class RoomCityDataSource(val context: Context) : CityDataSource {

  private val cityDao = WeatherDatabase.getInstance(context).cityDao()

  override suspend fun add(city: City) {
    return cityDao.addCity(
        CityEntity(
            city.id,
            city.name,
            city.country,
            city.lon,
            city.lat)
    )
  }

  override suspend fun readAll(): List<City> = cityDao.getCities().map {
    City(
        it.id,
        it.name,
        it.country,
        it.lon,
        it.lat
    )
  }

  override suspend fun remove(city: City) = cityDao.removeCity(
      CityEntity(city.id,
          city.name,
          city.country,
          city.lon,
          city.lat)
  )
}