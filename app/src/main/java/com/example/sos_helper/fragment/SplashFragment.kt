package com.example.sos_helper.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sos_helper.R

class SplashFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        init()
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun init() {
        handler()
    }

    private fun handler() {
        Handler().postDelayed({
            manageRedirection()
        }, 3000)
    }

    private fun manageRedirection() {
        if (!sharedPref.getOnBoardingShown()) {
            popupAndNavigate(R.id.splashFragment, R.id.onBoardingFragment)
        } else {
            if (sharedPref.getIsLoggedIn()) {
                popupAndNavigate(R.id.splashFragment, R.id.mainFragment)
            } else {
                popupAndNavigate(R.id.splashFragment, R.id.loginFragment)
            }
        }
    }

}