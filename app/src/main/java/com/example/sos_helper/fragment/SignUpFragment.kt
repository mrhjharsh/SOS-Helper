package com.example.sos_helper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.sos_helper.R
import com.example.sos_helper.databinding.FragmentSignUpBinding
import com.example.sos_helper.fbService.dbServices.SetSignupDetailsInDBService
import com.example.sos_helper.fbService.dbServices.SetTokenDetailsInDBService
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : BaseFragment(), View.OnClickListener,
    SetSignupDetailsInDBService.SignUpCallbacks {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.btnSignUP.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnSignUP) {
            if (binding.etEmail.text.toString().isBlank() || binding.etPassword.text.toString()
                    .isBlank()
                || binding.etConfirmPassword.text.toString().isBlank() || binding.etName.text.toString().isBlank()
            ) {
                Toast.makeText(requireActivity(), "Please submit all details", Toast.LENGTH_SHORT)
                    .show()
            } else {
                SetSignupDetailsInDBService().startService(
                    requireActivity(),
                    fbInstance,
                    binding.etName.text.toString(),
                    binding.etEmail.text.toString(),
                    binding.etPassword.text.toString(),
                    binding.etConfirmPassword.text.toString(),
                    this
                )
            }
        }

    }

    override fun onSuccess() {
        sharedPref.setUserEmail(binding.etEmail.text.toString())
        Toast.makeText(activity, "Signup Successful", Toast.LENGTH_SHORT).show()
        sharedPref.setIsLoggedIn(true)
        firebaseTokenGenerator()
        popupAndNavigate(R.id.signUpFragment, R.id.mainFragment)
    }

    override fun onFail() {
        Toast.makeText(activity, "Signup Failed", Toast.LENGTH_SHORT).show()
    }
}