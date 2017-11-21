package me.sekitaka.daggerexample

import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = arrayOf(AppModule::class, InjectedActivityModule::class))
interface AppComponent : AndroidInjector<App> {
}