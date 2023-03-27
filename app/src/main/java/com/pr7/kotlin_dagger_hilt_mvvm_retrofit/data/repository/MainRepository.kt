package com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.model.Post
import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.network.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainRepository @Inject constructor(
    val api: Api
) {


    fun getAllPosts():MutableLiveData<ArrayList<Post>>{
        val mutableLiveData=MutableLiveData<ArrayList<Post>>()
        val call:Call<ArrayList<Post>> =api.getAllPosts()
        call.enqueue(object :Callback<ArrayList<Post>> {
            override fun onResponse(
                call: Call<ArrayList<Post>>,
                response: Response<ArrayList<Post>>
            ) {
                if (response.isSuccessful){
                    mutableLiveData.value=response.body()!!
                }
            }

            override fun onFailure(call: Call<ArrayList<Post>>, t: Throwable) {

            }
        })
        return mutableLiveData
    }
}