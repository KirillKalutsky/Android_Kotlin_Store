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
        println("Корзина")

        var bananas = Product("Бананы", 100.0)
        var backet = BaseBasket(mutableListOf(bananas))
        println(backet.toString())
        backet.AddProduct(Product("Яблоки", 85.0))
        println(backet.toString())

        println("Стоимость без скидки = ${backet.CountCost()}")
        println("Стоимость со скидкой в 25% = ${backet.CountCost(25.0)}")

        backet.RemoveProduct(bananas)
        println(backet.toString())
    }
}