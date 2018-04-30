package com.rosterloh.workshopthing.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment
}