package me.sekitaka.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import org.jetbrains.anko.toast
import javax.inject.Inject

class InjectedActivity : AppCompatActivity() {
    @Inject lateinit var string:String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injected)
        toast(string)
    }
}
