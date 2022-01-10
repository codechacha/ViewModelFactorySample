package com.example.viewmodelfactory.third

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.viewmodelfactory.MyRepository

class ThirdActivityViewModel(
    application: Application, private val repository: MyRepository
) : AndroidViewModel(application) {

}