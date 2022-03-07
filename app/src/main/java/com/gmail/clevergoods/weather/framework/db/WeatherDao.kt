package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface WeatherDao {

  @Insert(onConflict = REPLACE)
  suspend fun addWeather(weather: WeatherEntity)

  @Query("SELECT * FROM weather WHERE city_id = :cityId")
  suspend fun getWeathers(cityId: Int): List<WeatherEntity>

  @Delete
  suspend fun removeWeather(weather: WeatherEntity)

  @Delete
  suspend fun removeWeathers(cityId: Int)

}