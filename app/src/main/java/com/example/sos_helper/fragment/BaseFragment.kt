package com.example.sos_helper.fragment

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.sos_helper.R
import com.example.sos_helper.fbService.dbServices.SetTokenDetailsInDBService
import com.example.sos_helper.sharedPreference.SharedPref
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessaging
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class BaseFragment : Fragment() {
    @Inject
    lateinit var fbInstance: FirebaseFirestore

    lateinit var sharedPref: SharedPref

    lateinit var activity: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        init()
        super.onCreate(savedInstanceState)
    }

    private fun init() {
        activity = requireActivity()
        sharedPref = SharedPref(requireActivity())
    }

    fun popupAndNavigate(from: Int, to: Int) {
        val navController = findNavController()
        val navOptions = NavOptions.Builder()
            .setPopUpTo(from, true) // This clears the back stack up to the selected Fragment
            .build()
        navController.navigate(to, null, navOptions)
    }

    fun firebaseTokenGenerator() {
        var tokenFCM: String = ""
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            val token = task.result
            tokenFCM = token.toString()
            SetTokenDetailsInDBService().startService(activity, fbInstance, tokenFCM)
        })
    }
}