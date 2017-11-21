package me.sekitaka.daggerexample

import dagger.Module
import dagger.Provides

@Module
class ShopModule {
    @Provides
    fun provideClerk(): Clerk {
        return BadClerk()
    }
}