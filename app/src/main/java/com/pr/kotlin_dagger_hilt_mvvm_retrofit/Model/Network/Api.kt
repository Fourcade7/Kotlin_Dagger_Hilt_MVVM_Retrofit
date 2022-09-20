package com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Network

import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Model_Response.Post
import retrofit2.Call
import retrofit2.http.GET


interface Api {

    @GET("posts")
    fun getAllPosts():Call<List<Post>>
}