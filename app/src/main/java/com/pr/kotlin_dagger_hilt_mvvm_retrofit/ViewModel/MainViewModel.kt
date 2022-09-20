package com.pr.kotlin_dagger_hilt_mvvm_retrofit.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Model_Response.Post
import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: MainRepository
):ViewModel() {

    val mylivedata=MutableLiveData<List<Post>>()

    fun loaData():MutableLiveData<List<Post>>{
        repository.gorequest(mylivedata)
        return mylivedata
    }



}