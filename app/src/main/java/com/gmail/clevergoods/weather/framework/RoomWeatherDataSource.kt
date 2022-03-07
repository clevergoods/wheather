package com.gmail.clevergoods.weather.framework

import android.content.Context
import com.gmail.clevergoods.weatheragregator.data.WeatherDataSource
import com.gmail.clevergoods.weatheragregator.domain.City
import com.gmail.clevergoods.weatheragregator.domain.Weather
import com.raywenderlich.android.majesticreader.framework.db.WeatherDatabase
import com.raywenderlich.android.majesticreader.framework.db.WeatherEntity

class RoomWeatherDataSource(context: Context) : WeatherDataSource {

    private val weatherDao = WeatherDatabase.getInstance(context).weatherDao()

    override suspend fun add(city: City, weather: Weather) =
        weatherDao.addWeather(
            WeatherEntity(
                id = weather.id,
                city_id = city.id,
                temp = weather.temp,
                feels_like = weather.feels_like,
                temp_min = weather.temp_min,
                temp_max = weather.temp_max,
                pressure = weather.pressure,
                sea_level = weather.sea_level,
                grnd_level = weather.grnd_level,
                humidity = weather.humidity,
                temp_kf = weather.temp_kf,
                dt = weather.dt
            )
        )

    override suspend fun read(city: City): List<Weather> = weatherDao
        .getWeathers(city.id).map {
            Weather(
                it.id,
                it.city_id,
                it.dt,
                it.temp,
                it.feels_like,
                it.temp_min,
                it.temp_max,
                it.pressure,
                it.sea_level,
                it.grnd_level,
                it.humidity,
                it.temp_kf
            )
        }

    override suspend fun remove(city: City, weather: Weather) =
        weatherDao.removeWeather(
            WeatherEntity(
                id = weather.id,
                city_id = city.id,
                temp = weather.temp,
                feels_like = weather.feels_like,
                temp_min = weather.temp_min,
                temp_max = weather.temp_max,
                pressure = weather.pressure,
                sea_level = weather.sea_level,
                grnd_level = weather.grnd_level,
                humidity = weather.humidity,
                temp_kf = weather.temp_kf,
                dt = weather.dt
            )
        )

    override suspend fun removeAll(city: City) {
        weatherDao.removeWeathers(city.id)
    }
}