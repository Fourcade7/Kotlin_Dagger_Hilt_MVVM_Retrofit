package com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Repository

import androidx.lifecycle.MutableLiveData
import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Model_Response.Post
import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Network.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainRepository @Inject constructor(
    val api: Api
){

    fun gorequest(liveData: MutableLiveData<List<Post>>){

        val call:Call<List<Post>> =api.getAllPosts()
        call?.enqueue(object :Callback<List<Post>>{

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                liveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

            }
        })

    }
}