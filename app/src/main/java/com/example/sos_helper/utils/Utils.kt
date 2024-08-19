package com.example.sos_helper.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.startActivity

open class Utils {
    fun startActivityUtils(className: Class<*>, activity: Activity, clear: Boolean) {
        var intent = Intent(activity, className::class.java)
        if (clear) {
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        }
        activity.startActivity(intent)
    }
    fun showInputMethod(view: View, activity: Activity) {
        val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
        imm?.showSoftInput(view, 0)
    }
}