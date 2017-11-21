package me.sekitaka.daggerexample

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by user544 on 2017/11/21.
 */
@Subcomponent
interface InjectedActivitySubcomponent : AndroidInjector<InjectedActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<InjectedActivity>()
}