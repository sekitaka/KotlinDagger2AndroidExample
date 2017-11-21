package me.sekitaka.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var clerk: Clerk

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerShopComponent.builder().shopModule(ShopModule(GoodClerk())).build().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(clerk.greeting())

        buttonInjectedActivity.setOnClickListener {
            startActivity<InjectedActivity>()
        }
    }
}
