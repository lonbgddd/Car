package com.example.car.fragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.car.model.Car
import com.example.car.model.CarElement
import com.example.car.network.RetroInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.awaitResponse

class HomeViewModel : ViewModel() {
    private val _number = MutableLiveData(0)

    val number: LiveData<Int> = _number
    fun onLike() {
        _number.value = (_number.value ?: 0) + 1
    }

    private val _liveDataAllPost = MutableLiveData<Car>()

    val liveDataAllPost: LiveData<Car> = _liveDataAllPost
    fun getCarAllData() = viewModelScope.launch {
        var data = RetroInstance.getRetroInstance().getPostList()
        data.let { res ->
            _liveDataAllPost.postValue(res.body())
        }

    }

}
