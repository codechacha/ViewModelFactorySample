package com.example.viewmodelfactory.first

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactory.MyRepository

class ViewModelFactory(private val repository: MyRepository)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FirstActivityViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FirstActivityViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}