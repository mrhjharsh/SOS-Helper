package com.example.sos_helper.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sos_helper.R
import com.example.sos_helper.adapter.SearchUserAdapter
import com.example.sos_helper.database.model.LoginClass
import com.example.sos_helper.database.service.DataBaseService
import com.example.sos_helper.databinding.FragmentSearchFriendBinding
import com.example.sos_helper.utils.Utils
import com.example.sos_helper.viewModel.LoginDetailsViewModel

class SearchFriendFragment : BaseFragment(), View.OnClickListener,
    DataBaseService.DataBaseServiceCallBack {

    private lateinit var loginDetailsViewModel: LoginDetailsViewModel
    private lateinit var binding: FragmentSearchFriendBinding
    private lateinit var loginDetailsModel: MutableList<LoginClass>
    private lateinit var loginDetailsModelFiltered: MutableList<LoginClass>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchFriendBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.svSearch.isIconified = false
        binding.svSearch.requestFocus()
        binding.svSearch.setOnClickListener(this)

        DataBaseService(activity, lifecycleScope).getAllLoginDetails(this)

        loginDetailsModel = mutableListOf()


        binding.svSearch.setOnQueryTextFocusChangeListener(View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                Utils().showInputMethod(view.findFocus(), requireActivity())
            }
        })

        binding.svSearch.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText!!.isNotEmpty()) {
                    filterUsers(newText)
                } else {
                    setAdapter(mutableListOf())
                }
                return true
            }

        })
    }

    private fun setAdapter(loginDetailsModelFiltered: MutableList<LoginClass>) {
        var searchUserAdapter = SearchUserAdapter(loginDetailsModelFiltered)
        binding.rvUsers.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvUsers.adapter = searchUserAdapter
    }

    private fun filterUsers(newText: String) {
        loginDetailsModelFiltered = mutableListOf()
        for (i in loginDetailsModel.indices) {
            if (loginDetailsModel[i].name.contains(newText)) {
                loginDetailsModelFiltered.add(loginDetailsModel[i])
            }
        }
        setAdapter(loginDetailsModelFiltered)
    }


    override fun onClick(v: View) {
        if (v.id == R.id.svSearch) {
            binding.svSearch.isIconified = false
            binding.svSearch.requestFocus()
        }
    }

    override fun getAllLoginDetails(loginDetailsModel: MutableList<LoginClass>) {
        this.loginDetailsModel = loginDetailsModel
        Log.d("<<<>>>" , loginDetailsModel.size.toString())

    }
}