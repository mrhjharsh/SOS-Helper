package com.example.sos_helper.sharedPreference

import android.app.Activity
import android.content.SharedPreferences
import androidx.transition.Visibility.Mode
import com.example.sos_helper.R

class SharedPref(private val activity: Activity) {
    private var sharedPreferences: SharedPreferences =
        activity.getSharedPreferences(activity.getString(R.string.app_name), 0)
    private var editor: SharedPreferences.Editor = sharedPreferences.edit()

    private val IS_ON_BOARDING_SHOWN = "isOnBoardingShown"
    private val IS_LOGGED_IN = "isLoggedIn"
    private val USER_EMAIL = "userEmail"
    private val USER_INSERTED = "userInserted"

    fun setOnBoardingShown(value: Boolean) {
        editor.putBoolean(IS_ON_BOARDING_SHOWN, value)
        editor.commit()
    }

    fun getOnBoardingShown(): Boolean {
        return sharedPreferences.getBoolean(IS_ON_BOARDING_SHOWN, false)
    }

    fun setIsLoggedIn(value: Boolean) {
        editor.putBoolean(IS_LOGGED_IN, value)
        editor.commit()
    }

    fun getIsLoggedIn(): Boolean {
        return sharedPreferences.getBoolean(IS_LOGGED_IN, false)
    }

    fun setIsUserInserted(value: Boolean) {
        editor.putBoolean(USER_INSERTED, value)
        editor.commit()
    }

    fun getIsUserInserted(): Boolean {
        return sharedPreferences.getBoolean(USER_INSERTED, false)
    }

    fun setUserEmail(value: String) {
        editor.putString(USER_EMAIL, value)
        editor.commit()
    }

    fun getUserEmail(): String? {
        return sharedPreferences.getString(USER_EMAIL, "")
    }
}