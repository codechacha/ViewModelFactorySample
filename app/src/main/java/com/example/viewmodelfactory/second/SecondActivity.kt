package com.example.viewmodelfactory.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactory.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application))
                .get(SecondActivityViewModel::class.java)
    }
}