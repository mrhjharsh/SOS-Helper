package com.example.sos_helper.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.sos_helper.model.LoginDetails
import com.google.firebase.firestore.FirebaseFirestore

class LoginDetailsRepository {

    lateinit var loginLiveData: MutableLiveData<MutableList<LoginDetails>>
    lateinit var fbInstance: FirebaseFirestore
    lateinit var list: MutableList<LoginDetails>

    init {
        fetchDetailsFromFireBase()
    }

    private fun fetchDetailsFromFireBase() {
        loginLiveData = MutableLiveData()
        fbInstance = FirebaseFirestore.getInstance()
        list = mutableListOf()

        fbInstance.collection("USER_DETAILS").get().addOnSuccessListener {

            for (i in 0 until it.documents.size) {
                val data = it.documents[i].data
                var email: String = data!!["EMAIL"].toString()
                var password: String = data["PASSWORD"].toString()
                var name: String = data["NAME"].toString()
                var cPassword: String = data["CONFIRM_PASSWORD"].toString()
                list.add(LoginDetails(email, name, password, cPassword))
            }
            loginLiveData.value = list
        }
    }

    fun getLiveData(): MutableLiveData<MutableList<LoginDetails>> {
        return loginLiveData
    }
}