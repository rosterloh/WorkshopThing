package com.rosterloh.workshopthing.di.modules

import com.rosterloh.workshopthing.di.annotations.ActivityScope
import com.rosterloh.workshopthing.main.MainActivity
import com.rosterloh.workshopthing.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}