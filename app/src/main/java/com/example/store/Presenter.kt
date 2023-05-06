package com.example.store

import Helper.PriceHelper

class Presenter(val Basket:BaseBasket) {

    fun priceNamePrint(){
        val basketContents = Basket.GetProducts()
            .map { product -> "${product.GetName()}: ${PriceHelper.RoundPrice(product.GetPrice(Basket.GetDiscount()))}" }
            .joinToString(";\n") + "\nИтого: ${PriceHelper.RoundPrice(Basket.CountCost())}";

        println(basketContents);
    }
}