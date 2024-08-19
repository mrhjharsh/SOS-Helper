package com.example.sos_helper.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.sos_helper.database.model.LoginDetailsModel

@Dao
interface LoginDetailDao {

    @Insert
    fun insert(loginDetailsModel: LoginDetailsModel)

    @Update
    fun update(loginDetailsModel: LoginDetailsModel)

    @Query("Select * from loginDetailTable")
    fun getAllLoginDetails(): LoginDetailsModel
}