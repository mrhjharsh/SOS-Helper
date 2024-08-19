package com.example.sos_helper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.sos_helper.R
import com.example.sos_helper.databinding.FragmentLoginBinding
import com.example.sos_helper.fbService.dbServices.SetTokenDetailsInDBService
import com.example.sos_helper.model.LoginDetails
import com.example.sos_helper.viewModel.LoginDetailsViewModel
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : BaseFragment(), View.OnClickListener {

    private lateinit var loginDetailsViewModel: LoginDetailsViewModel
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.btnLogin.setOnClickListener(this)
        binding.txtSignup.setOnClickListener(this)
    }

    private fun fetchData() {
        loginDetailsViewModel = ViewModelProvider(this)[LoginDetailsViewModel::class.java]
        loginDetailsViewModel.getLiveData().observe(requireActivity()) { responseData ->
            if (validateCred(responseData)) {
                sharedPref.setUserEmail(binding.etEmail.text.toString())
                firebaseTokenGenerator()
                popupAndNavigate(R.id.loginFragment, R.id.mainFragment)
                sharedPref.setIsLoggedIn(true)
            } else {
                Toast.makeText(requireActivity(), "Wrong Credentials", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun validateCred(responseData: MutableList<LoginDetails>): Boolean {
        for (i in 0 until responseData.size) {
            if (responseData[i].email == binding.etEmail.text.toString()) {
                if (responseData[i].password == binding.etPassword.text.toString()) {
                    return true
                } else {
                    return false
                }
            }
        }
        return false
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnLogin) {
            fetchData()
        }
        if (v.id == R.id.txtSignup) {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
    }
}