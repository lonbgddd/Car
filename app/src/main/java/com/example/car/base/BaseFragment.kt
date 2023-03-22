package com.example.car.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import java.util.zip.Inflater


abstract class BaseFragment<T : ViewDataBinding, MD : ViewModel> : Fragment() {
    protected lateinit var binding: T
    protected lateinit var viewModel: MD


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            getBinDing(),
            container,
            false
        )
        viewModel = ViewModelProvider(this)[getViewModel()]
        return binding.root
    }

    abstract fun getViewModel(): Class<MD>

    abstract fun getBinDing(): Int


    fun backStack() {
        findNavController().popBackStack()
    }

}