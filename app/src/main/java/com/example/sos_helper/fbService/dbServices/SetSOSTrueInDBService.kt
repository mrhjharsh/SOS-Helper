package com.example.sos_helper.fbService.dbServices

import android.app.Activity
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class SetSOSTrueInDBService {

    fun startService(activity: Activity ,firestoreInstance : FirebaseFirestore) {

        val user = hashMapOf(
            "first" to "Ada",
            "last" to "Lovelace",
            "born" to 1815,
        )
        firestoreInstance.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("<<<>>>", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("<<<>>>", "Error adding document", e)
            }
    }
}