package com.gmail.clevergoods.weatheragregator.domain

import java.io.Serializable

data class Weather(
    val id: Int = 0,
    val city_id: Int,
    val dt: Long,
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Double,
    val sea_level: Double,
    val grnd_level: Double,
    val humidity: Double,
    val temp_kf: Double
): Serializable {
    companion object {
        val EMPTY = Weather(0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
    }
}