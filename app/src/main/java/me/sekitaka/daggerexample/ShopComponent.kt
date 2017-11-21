package me.sekitaka.daggerexample

import dagger.Component
import javax.inject.Inject

@Component(modules = arrayOf(ShopModule::class))
interface ShopComponent {
    fun clerk(): Clerk
}