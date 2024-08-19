package com.example.sos_helper.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.sos_helper.R
import com.example.sos_helper.database.AppDatabase
import com.example.sos_helper.database.model.LoginClass
import com.example.sos_helper.database.model.LoginDetailsModel
import com.example.sos_helper.database.service.DataBaseService
import com.example.sos_helper.databinding.FragmentAddFriendBinding
import com.example.sos_helper.databinding.FragmentSignUpBinding
import com.example.sos_helper.model.LoginDetails
import com.example.sos_helper.viewModel.LoginDetailsViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Collections
import kotlin.math.truncate

class AddFriendFragment : BaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentAddFriendBinding
    private lateinit var loginDetailsViewModel: LoginDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddFriendBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.svSearch.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.svSearch) {
            fetchData()
        }
    }

    private fun fetchData() {
        loginDetailsViewModel = ViewModelProvider(this)[LoginDetailsViewModel::class.java]
        loginDetailsViewModel.getLiveData().observe(requireActivity()) {
            var loginClassList: MutableList<LoginClass> = mutableListOf()
            for (i in it.indices) {
                loginClassList.add(LoginClass(it[i].name, it[i].email))
            }

            if (sharedPref.getIsUserInserted()) {
                DataBaseService(activity, lifecycleScope).update(
                    LoginDetailsModel(
                        1,
                        loginClassList
                    )
                )
            } else {
                sharedPref.setIsUserInserted(true)
                DataBaseService(activity, lifecycleScope).insert(
                    LoginDetailsModel(
                        1,
                        loginClassList
                    )
                )
            }
            findNavController().navigate(R.id.action_addFriendFragment_to_searchFriendFragment)
        }
    }
}