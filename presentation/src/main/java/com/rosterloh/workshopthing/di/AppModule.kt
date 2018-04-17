package com.rosterloh.workshopthing.di

import android.content.Context
import com.rosterloh.workshopthing.App
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    internal abstract fun bindContext(context: App): Context
}