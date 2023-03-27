package com.pr7.kotlin_dagger_hilt_mvvm_retrofit.di.component

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppComponent():Application()