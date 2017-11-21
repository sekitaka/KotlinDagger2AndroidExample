package me.sekitaka.daggerexample

import dagger.Component
import dagger.android.AndroidInjector

/**
 * Created by user544 on 2017/11/21.
 */
@Component(modules = arrayOf(AppModule::class, InjectedActivityModule::class))
interface AppComponent : AndroidInjector<App> {
}