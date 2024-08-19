package com.example.sos_helper.fragment

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startForegroundService
import androidx.navigation.fragment.findNavController
import com.example.sos_helper.MyForegroundService
import com.example.sos_helper.R
import com.example.sos_helper.databinding.FragmentMainBinding
import com.example.sos_helper.databinding.FragmentOnBoardingBinding

class MainFragment : BaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.btnSOS.setOnClickListener(this)
        binding.imvAddFriend.setOnClickListener(this)

        if (!isServiceRunning(MyForegroundService::class.java)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                startForegroundService(
                    requireActivity(),
                    Intent(requireActivity(), MyForegroundService::class.java)
                )
            }
        }
    }

    private fun isServiceRunning(serviceClass: Class<*>): Boolean {
        val manager =
            requireActivity().getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name == service.service.className) {
                return true
            }
        }
        return false
    }


    override fun onClick(v: View) {
        if (v.id == R.id.btnSOS) {
            setSOSInDBTrue()
        }
        if (v.id == R.id.imvAddFriend) {
            findNavController().navigate(R.id.action_mainFragment_to_addFriendFragment)
        }
    }

    private fun setSOSInDBTrue() {

    }

}