package me.sekitaka.daggerexample

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module(subcomponents = arrayOf(InjectedActivitySubcomponent::class))
abstract class InjectedActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(InjectedActivity::class)
    abstract fun bindInjectedActivityInjectorFactory(builder: InjectedActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}