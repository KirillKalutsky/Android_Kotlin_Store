package com.example.store

import Helper.PriceHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Округление цены")
        println(PriceHelper.RoundPrice(100.1567));
        println(PriceHelper.RoundPrice(2.564));
        println(PriceHelper.RoundPrice(2.56));
        println(PriceHelper.RoundPrice(2.565));
    }
}