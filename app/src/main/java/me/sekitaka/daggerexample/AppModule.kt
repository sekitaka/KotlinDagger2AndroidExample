package me.sekitaka.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by user544 on 2017/11/21.
 */
@Module
class AppModule {
    @Provides
    @Named("text1")
    fun provideText1(): String {
        return "Hello world1"
    }

    @Provides
    @Named("text2")
    fun provideText2(): String {
        return "Hello world2"
    }
}