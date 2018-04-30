package com.rosterloh.workshopthing.di.modules

import android.app.Application
import android.content.Context
import com.rosterloh.workshopthing.di.annotations.ApplicationScope
import dagger.Module
import dagger.Provides

@Module(includes = [NetworkModule::class])
class AppModule {

    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context = application
}