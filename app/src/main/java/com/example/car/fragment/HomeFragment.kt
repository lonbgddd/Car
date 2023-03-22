package com.example.car.fragment

import android.os.Bundle
import android.view.View
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
    }
    override fun getViewModel(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun getBinDing(): Int = R.layout.fragment_home


}