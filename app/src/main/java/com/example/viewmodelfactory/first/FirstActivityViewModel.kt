package com.example.viewmodelfactory.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodelfactory.MyRepository

class FirstActivityViewModel(
    private val repository: MyRepository
) : ViewModel() {

    val result = MutableLiveData<String>("init value")

    fun reloadResults() {
        result.value = repository.getResult()
    }
}