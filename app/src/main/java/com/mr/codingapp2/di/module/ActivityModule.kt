package com.mr.codingapp2.di.module

import android.app.Activity
import com.mr.codingapp2.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @ActivityScope
    fun provideActivity(): Activity = activity
}