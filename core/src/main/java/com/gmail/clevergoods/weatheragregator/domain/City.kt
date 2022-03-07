package com.gmail.clevergoods.weatheragregator.domain
import java.io.Serializable

data class City(
    val id: Int = 0,
    val name: String,
    val country: String,
    val lon: Double,
    val lat: Double): Serializable {
    companion object {
        val EMPTY = City(0, "", "", 0.0, 0.0)
    }
}
