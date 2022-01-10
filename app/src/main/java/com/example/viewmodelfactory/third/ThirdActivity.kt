package com.example.viewmodelfactory.third

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactory.MyRepository
import com.example.viewmodelfactory.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val repository = MyRepository()
        val viewModelFactory = ViewModelFactory(application, repository)
        
        val viewModel = ViewModelProvider(this, viewModelFactory)
                .get(ThirdActivityViewModel::class.java)
    }
}