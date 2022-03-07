package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface CityDao {

  @Insert(onConflict = REPLACE)
  suspend fun addCity(city: CityEntity)

  @Query("SELECT * FROM city")
  suspend fun getCities(): List<CityEntity>

  @Delete
  suspend fun removeCity(city: CityEntity)
}
