package com.example.viewmodelfactory.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val result = MutableLiveData<String>("init value")

}