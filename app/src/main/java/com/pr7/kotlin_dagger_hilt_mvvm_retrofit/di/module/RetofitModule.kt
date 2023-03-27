package com.pr7.kotlin_dagger_hilt_mvvm_retrofit.di.module

import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.network.Api
import com.pr7.kotlin_dagger_hilt_mvvm_retrofit.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RetofitModule {



    @Provides
    fun provideRetrofit():Retrofit{
        val retrofit=Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return  retrofit
    }

    @Provides
    fun provideApi(retrofit: Retrofit):Api{
        val api=retrofit.create(Api::class.java)
        return api
    }

    @Provides
    fun provideRepository(api: Api):MainRepository=MainRepository(api)

}