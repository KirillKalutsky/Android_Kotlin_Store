package com.example.store

class BaseBasket(val Products:MutableList<Product> = mutableListOf()) {

    fun AddProduct(product: Product){
        Products.add(product)
    }

    fun CountCost(discountPercent:Double = 0.0):Double{
        var sum = 0.0;

        for (product in Products)
            sum+=product.Price;

        var discountPrice = sum*discountPercent/100;
        return sum-discountPrice;
    }

    override fun toString(): String =
        "Корзина на сумму: ${CountCost()}\nТовары:\n" +
                Products.map { product -> product.toString() }.joinToString(";\n");

    fun RemoveProduct(product: Product){
        Products.removeIf { p -> p.UnicleIndicator == product.UnicleIndicator};
    }
}