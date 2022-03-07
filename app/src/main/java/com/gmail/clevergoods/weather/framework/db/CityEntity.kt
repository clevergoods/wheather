package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gmail.clevergoods.weatheragregator.domain.City
import java.io.Serializable

@Entity(tableName = "city")
data class CityEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "lon") val lon: Double,
    @ColumnInfo(name = "lat") val lat: Double
) : Serializable {
    companion object {
        val EMPTY = City(0, "", "", 0.0, 0.0)
    }
}

