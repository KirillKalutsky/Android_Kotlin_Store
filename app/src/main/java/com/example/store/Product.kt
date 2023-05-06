package com.example.store

import java.util.*

class Product(private val name:String,
              private val price:Double,
              private val unicleIndicator:UUID = UUID.randomUUID()) {

    fun GetPrice(discountPercentage:Double = 0.0):Double{
        return  price - discountPercentage * price / 100;
    }

    fun GetName():String = name;

    fun GetId():UUID = unicleIndicator;

    override fun toString(): String =
        "Продукт: ${name}\nЦена: ${price}"
}