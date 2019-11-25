package com.example.databinding_example.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BindingViewModel: ViewModel() {

    private val _progressBarController = MutableLiveData(0)

    var progressBarController: LiveData<Int> = _progressBarController

    fun onProgressBarInc (){
        _progressBarController.value = (_progressBarController.value ?: 0) + 1
    }

}