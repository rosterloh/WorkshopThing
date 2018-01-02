package com.rosterloh.workshopthing.di

import com.rosterloh.workshopthing.ui.main.MainActivity
import com.rosterloh.workshopthing.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun mainActivity(): MainActivity
}