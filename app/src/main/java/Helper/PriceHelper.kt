package Helper

import kotlin.math.pow
import kotlin.math.roundToInt

object PriceHelper {
    fun Round(num: Double, countAfterDecimal:Int ):Double{
        var tenPow = 10.0.pow(countAfterDecimal);
        return  (num * tenPow).roundToInt()/tenPow;
    }

    fun RoundPrice(price:Double): Double {
        return Round(price, 2);
    }
}