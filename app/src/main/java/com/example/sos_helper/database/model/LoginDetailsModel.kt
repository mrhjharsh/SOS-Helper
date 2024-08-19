package com.example.sos_helper.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.sos_helper.Converters


@Entity(tableName = "loginDetailTable")
@TypeConverters(Converters::class)
data class LoginDetailsModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val listData: MutableList<LoginClass>
)

