package me.sekitaka.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    var shop = DaggerShopComponent.builder().shopModule(ShopModule(GoodClerk())).build()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(shop.clerk().greeting())
    }
}
