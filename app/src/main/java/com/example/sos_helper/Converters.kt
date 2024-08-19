package com.example.sos_helper

import androidx.room.TypeConverter
import com.example.sos_helper.database.model.LoginClass
import com.example.sos_helper.model.LoginDetails
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {

    @TypeConverter
    fun fromLoginDetailsList(value: String): MutableList<LoginClass> {
        val listType = object : TypeToken<MutableList<LoginClass>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromMutableList(list: MutableList<LoginClass>): String {
        return Gson().toJson(list)
    }
}
