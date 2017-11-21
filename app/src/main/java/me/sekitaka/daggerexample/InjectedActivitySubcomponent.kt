package me.sekitaka.daggerexample

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface InjectedActivitySubcomponent : AndroidInjector<InjectedActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<InjectedActivity>()
}