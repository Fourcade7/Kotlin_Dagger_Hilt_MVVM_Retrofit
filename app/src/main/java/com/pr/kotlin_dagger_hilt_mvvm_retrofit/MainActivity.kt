package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.pr.kotlin_dagger_hilt_mvvm_retrofit.ViewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val TAG="PR7"


    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.loaData()

        



    }
}