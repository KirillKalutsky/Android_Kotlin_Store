package com.example.store

import java.util.*

class Product(val Name:String, val Price:Double,
              val UnicleIndicator:UUID = UUID.randomUUID()) {
    override fun toString(): String =
        "Продукт: ${Name}\nЦена: ${Price}"
}