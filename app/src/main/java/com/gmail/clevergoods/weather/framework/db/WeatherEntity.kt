package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather")
data class WeatherEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "city_id") val city_id: Int,
    @ColumnInfo(name = "temp") val temp: Double,
    @ColumnInfo(name = "feels_like") val feels_like: Double,
    @ColumnInfo(name = "temp_min") val temp_min: Double,
    @ColumnInfo(name = "temp_max") val temp_max: Double,
    @ColumnInfo(name = "pressure") val pressure: Double,
    @ColumnInfo(name = "sea_level") val sea_level: Double,
    @ColumnInfo(name = "grnd_level") val grnd_level: Double,
    @ColumnInfo(name = "humidity") val humidity: Double,
    @ColumnInfo(name = "temp_kf") val temp_kf: Double,
    @ColumnInfo(name = "dt") val dt: Long
)