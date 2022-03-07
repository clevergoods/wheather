package com.raywenderlich.android.majesticreader.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [WeatherEntity::class, CityEntity::class],
    version = 1,
    exportSchema = false
)
abstract class WeatherDatabase : RoomDatabase() {

  companion object {

    private const val DATABASE_NAME = "reader.db"

    private var instance: WeatherDatabase? = null

    private fun create(context: Context): WeatherDatabase =
        Room.databaseBuilder(context, WeatherDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()


    fun getInstance(context: Context): WeatherDatabase =
        (instance ?: create(context)).also { instance = it }
  }

  abstract fun weatherDao(): WeatherDao

  abstract fun cityDao(): CityDao

}