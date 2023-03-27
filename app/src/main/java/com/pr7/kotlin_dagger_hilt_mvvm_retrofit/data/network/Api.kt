package com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.network



import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface Api {


    @GET("posts")
    fun getAllPosts(): Call<ArrayList<Post>>

}