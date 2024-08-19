package com.example.sos_helper.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sos_helper.database.dao.LoginDetailDao
import com.example.sos_helper.database.model.LoginDetailsModel

@Database(entities = [LoginDetailsModel::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun loginDetailDao(): LoginDetailDao
}
