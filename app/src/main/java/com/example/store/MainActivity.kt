package com.example.store

import Helper.PriceHelper
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.store.Price.IPriceFormatter
import com.example.store.Price.StorePriceFormatter
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.btn_click_me) as Button;
        val layout = findViewById(R.id.ll_main_layout) as LinearLayout;
        btn_click_me.setOnClickListener {
            layout.setBackgroundColor(Color.argb(255, Random.nextInt(0, 256),Random.nextInt(0, 256),Random.nextInt(0, 256)));
        }

        println("Корзина")

        var bananas = Product("Бананы", 100.0)
        var backet = BaseBasket(mutableListOf(bananas))
        backet.AddProduct(Product("Яблоки", 85.0))
        backet.SetDiscount(10.0);

        val presenter = Presenter(backet);
        presenter.priceNamePrint();
    }
}