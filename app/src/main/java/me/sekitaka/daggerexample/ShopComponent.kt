package me.sekitaka.daggerexample

import dagger.Component
import javax.inject.Inject
import javax.inject.Named

@Component(modules = arrayOf(ShopModule::class))
interface ShopComponent {
//    fun clerk(): Clerk
    fun inject(activity:MainActivity)
}