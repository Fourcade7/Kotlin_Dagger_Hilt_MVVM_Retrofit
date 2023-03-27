package com.pr7.kotlin_dagger_hilt_mvvm_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val viewmodel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel.getAllData().observe(this@MainActivity,{
            Toast.makeText(this@MainActivity,it.size.toString(),Toast.LENGTH_SHORT).show()

        })

    }
}