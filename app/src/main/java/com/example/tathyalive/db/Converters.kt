package com.example.tathyalive.db

import androidx.room.TypeConverter
import com.example.tathyalive.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}