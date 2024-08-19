package com.example.sos_helper.fbService.dbServices

import android.app.Activity
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class SetSignupDetailsInDBService {

    fun startService(
        activity: Activity,
        firestoreInstance: FirebaseFirestore,
        name: String,
        email: String,
        password: String,
        cPassword: String,
        signUpCallbacks: SignUpCallbacks
    ) {

        val userDetails = hashMapOf(
            "EMAIL" to email,
            "NAME" to name,
            "PASSWORD" to password,
            "CONFIRM_PASSWORD" to cPassword
        )
        firestoreInstance.collection("USER_DETAILS").document(email)
            .set(userDetails)
            .addOnSuccessListener { documentReference ->
                signUpCallbacks.onSuccess()
                Log.d(
                    javaClass.simpleName,
                    "DocumentSnapshot added"
                )
            }
            .addOnFailureListener { e ->
                signUpCallbacks.onFail()
                Log.w(javaClass.simpleName, "Error adding document", e)
            }
    }

    interface SignUpCallbacks {
        fun onSuccess()
        fun onFail()
    }
}