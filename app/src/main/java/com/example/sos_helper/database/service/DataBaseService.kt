package com.example.sos_helper.database.service

import android.app.Activity
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.room.Room
import com.example.sos_helper.R
import com.example.sos_helper.database.AppDatabase
import com.example.sos_helper.database.model.LoginClass
import com.example.sos_helper.database.model.LoginDetailsModel
import com.example.sos_helper.sharedPreference.SharedPref
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.truncate

class DataBaseService(
    private val activity: Activity,
    private val lifecycleCoroutineScope: LifecycleCoroutineScope
) {
    private val database: AppDatabase = Room.databaseBuilder(
        activity, AppDatabase::class.java, activity.getString(R.string.app_name)
    ).fallbackToDestructiveMigration().build()

    fun insert(loginDetailsModel: LoginDetailsModel) {
        lifecycleCoroutineScope.launch(Dispatchers.IO) {
            database.loginDetailDao().insert(loginDetailsModel)
        }
    }

    fun update(loginDetailsModel: LoginDetailsModel) {
        lifecycleCoroutineScope.launch(Dispatchers.IO) {
            database.loginDetailDao().update(loginDetailsModel)
        }
    }

    fun getAllLoginDetails(
        callBack: DataBaseServiceCallBack
    ) {
        var loginDetailsList: MutableList<LoginClass> = mutableListOf()
        lifecycleCoroutineScope.launch(Dispatchers.IO) {
            loginDetailsList = database.loginDetailDao().getAllLoginDetails().listData
        }.invokeOnCompletion {
            callBack.getAllLoginDetails(loginDetailsList)
        }
    }

    interface DataBaseServiceCallBack {
        fun getAllLoginDetails(loginDetailsModel: MutableList<LoginClass>)
    }
}