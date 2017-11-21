package me.sekitaka.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class ShopModule(var clerk: Clerk) {
    @Provides
    fun provideClerk(): Clerk {
        return clerk
    }
}