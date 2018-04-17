package com.rosterloh.workshopthing.di

import com.rosterloh.workshopthing.main.MainActivity
import com.rosterloh.workshopthing.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun mainFragment(): MainFragment
}