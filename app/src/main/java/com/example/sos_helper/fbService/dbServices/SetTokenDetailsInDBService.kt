package com.example.sos_helper.fbService.dbServices

import android.app.Activity
import android.util.Log
import com.example.sos_helper.sharedPreference.SharedPref
import com.google.firebase.firestore.FirebaseFirestore

class SetTokenDetailsInDBService {

    fun startService(
        activity: Activity,
        firestoreInstance: FirebaseFirestore,
        token: String,
    ) {

        val userDetails = hashMapOf(
            "TOKEN" to token
        )
        firestoreInstance.collection("USER_TOKEN")
            .document(SharedPref(activity).getUserEmail().toString()).set(userDetails)
            .addOnSuccessListener { documentReference ->
                Log.d(
                    javaClass.simpleName,
                    "DocumentSnapshot added."
                )
            }
            .addOnFailureListener { e ->
                Log.w(javaClass.simpleName, "Error adding document", e)
            }
    }
}