package com.example.sos_helper.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sos_helper.R
import com.example.sos_helper.databinding.FragmentOnBoardingBinding
import com.example.sos_helper.utils.Utils

class OnBoardingFragment : BaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.btnOnBoarding.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnOnBoarding) {
            sharedPref.setOnBoardingShown(true)
            findNavController().navigate(R.id.action_onBoardingFragment_to_loginFragment)
        }
    }
}