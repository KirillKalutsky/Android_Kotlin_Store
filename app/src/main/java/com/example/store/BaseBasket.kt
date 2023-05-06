package com.example.store

class BaseBasket(
    private val products:MutableList<Product> = mutableListOf(),
    private var discountPercentage:Double = 0.0) {

    fun AddProduct(product: Product){
        products.add(product)
    }

    fun SetDiscount(newDiscount:Double){
        if(newDiscount >= 0 && newDiscount <= 100)
            discountPercentage = newDiscount;
    }
    fun GetProducts():MutableList<Product> =
        products;

    fun GetDiscount():Double = discountPercentage

    fun CountCost():Double{
        var sum = 0.0;

        for (product in products)
            sum += product.GetPrice();

        var discountPrice = sum * discountPercentage / 100;
        return sum-discountPrice;
    }

    override fun toString(): String =
        "Корзина на сумму: ${CountCost()}\nТовары:\n" +
                products.map { product -> product.toString() }.joinToString(";\n");

    fun RemoveProduct(product: Product){
        products.removeIf { p -> p.GetId() == product.GetId()};
    }
}