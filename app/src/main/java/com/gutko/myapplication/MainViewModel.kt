package com.gutko.myapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    init {
        println("______________________")
    }
}