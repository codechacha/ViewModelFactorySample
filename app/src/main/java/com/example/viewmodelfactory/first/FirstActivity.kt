package com.example.viewmodelfactory.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactory.MyRepository
import com.example.viewmodelfactory.R
import com.example.viewmodelfactory.third.ViewModelFactory

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val repository = MyRepository()
        val viewModelFactory = ViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(FirstActivityViewModel::class.java)

        viewModel.result.observe(this) {
            Log.d("Test", "Updated: $it")
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            viewModel.reloadResults()
        }
    }
}