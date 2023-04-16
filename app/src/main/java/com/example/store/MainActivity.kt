package com.example.store

import Helper.PriceHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.store.Price.IPriceFormatter
import com.example.store.Price.StorePriceFormatter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Округление цены")
        var priceFormatter:IPriceFormatter = StorePriceFormatter();
        println(priceFormatter.Print(2.565));
    }
}