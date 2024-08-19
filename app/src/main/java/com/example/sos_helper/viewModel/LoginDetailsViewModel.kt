package com.example.sos_helper.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sos_helper.model.LoginDetails
import com.example.sos_helper.repository.LoginDetailsRepository

class LoginDetailsViewModel : ViewModel() {

    private val loginDetailsRepository = LoginDetailsRepository()

    fun getLiveData() : MutableLiveData<MutableList<LoginDetails>> {
        return loginDetailsRepository.getLiveData()
    }
}