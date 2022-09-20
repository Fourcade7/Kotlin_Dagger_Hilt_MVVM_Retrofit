package com.pr.kotlin_dagger_hilt_mvvm_retrofit.Hilt

import com.pr.kotlin_dagger_hilt_mvvm_retrofit.Model.Network.Api
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    fun provideApi(retrofit: Retrofit):Api{
        return retrofit.create(Api::class.java)
    }


    @Provides
    fun provideRetrofit():Retrofit{
        val retrofit=Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

}