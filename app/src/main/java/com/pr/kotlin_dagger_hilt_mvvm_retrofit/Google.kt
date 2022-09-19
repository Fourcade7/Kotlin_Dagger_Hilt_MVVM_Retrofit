package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Module
class Google {

    val TAG="PR7"
    fun prpr(){
        Log.d(TAG, "prpr: invoked")
    }


    @Provides
    fun provideYandex():Yandex= Yandex()



}