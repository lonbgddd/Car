package com.example.car.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.example.car.R
import com.example.car.base.BaseFragment
import com.example.car.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.getCarAllData()

        viewModel.liveDataAllPost.observe(viewLifecycleOwner, Observer {
            Log.d("TAG", "onViewCreated: $it")
        })
    }
    override fun getViewModel(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun getBinDing(): Int = R.layout.fragment_home


}