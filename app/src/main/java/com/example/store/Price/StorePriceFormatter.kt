package com.example.store.Price

import Helper.PriceHelper

class StorePriceFormatter:IPriceFormatter {
    override fun Print(price: Double): String {
        var roundedPrice = PriceHelper.RoundPrice(price);
        return roundedPrice.toString();
    }
}