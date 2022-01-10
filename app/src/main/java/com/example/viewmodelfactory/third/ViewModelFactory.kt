package com.example.viewmodelfactory.third

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactory.MyRepository

class ViewModelFactory(private val application: Application, private val repository: MyRepository)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ThirdActivityViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ThirdActivityViewModel(application, repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}