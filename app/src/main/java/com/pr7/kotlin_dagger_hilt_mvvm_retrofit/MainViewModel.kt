package com.pr7.kotlin_dagger_hilt_mvvm_retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.model.Post
import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: MainRepository
):ViewModel() {


    fun getAllData():MutableLiveData<ArrayList<Post>>{
        return repository.getAllPosts()
    }
}