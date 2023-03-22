package com.example.car.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()
    private val _number =  MutableLiveData(0)

    val number: LiveData<Int> = _number

    fun onLike() {
        _number.value = (_number.value ?: 0) + 1
    }

}

class HomeState