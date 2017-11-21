package me.sekitaka.daggerexample

import dagger.Module
import dagger.Provides

/**
 * Created by user544 on 2017/11/21.
 */
@Module
class AppModule {
    @Provides
    fun provideString(): String {
        return "Hello world"
    }
}