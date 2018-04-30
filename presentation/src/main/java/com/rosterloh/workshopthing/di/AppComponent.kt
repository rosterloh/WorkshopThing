package com.rosterloh.workshopthing.di

import com.rosterloh.workshopthing.App
import com.rosterloh.workshopthing.di.annotations.ApplicationScope
import com.rosterloh.workshopthing.di.modules.ActivityBuilderModule
import com.rosterloh.workshopthing.di.modules.AppModule
import com.rosterloh.workshopthing.di.modules.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ViewModelModule::class,
    ActivityBuilderModule::class
])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}