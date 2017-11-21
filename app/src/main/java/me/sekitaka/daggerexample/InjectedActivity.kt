package me.sekitaka.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_injected.*
import org.jetbrains.anko.toast
import javax.inject.Inject
import javax.inject.Named

class InjectedActivity : AppCompatActivity() {
    @Inject @field:Named("text1") lateinit var text1: String
    @Inject @field:Named("text2") lateinit var text2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injected)
        button1.setOnClickListener { toast(text1) }
        button2.setOnClickListener { toast(text2) }
    }

}
