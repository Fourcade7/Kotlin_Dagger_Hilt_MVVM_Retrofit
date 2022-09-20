package com.pr.kotlin_dagger_hilt_mvvm_retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named


@Module
@InstallIn(ActivityComponent::class)
class AppModule {


    @Provides
    fun provideFirebase():Firebase{
        val firebase=Firebase()
        firebase.connect()
        return firebase
    }

    @Provides
    fun provideYoutube():Youtube{
        val youtube=Youtube()
        youtube.playvideo()
        return youtube
    }


    @Provides
    @Named("name")
    fun name()="Aminov"

    @Provides
    @Named("fullname")
    fun fullnamename()="Fourcade7"
}