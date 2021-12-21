package funciones

fun main() {
    val productPrices = doubleArrayOf(5.0, 3.0, 2.0)
    getProductPrices(productPrices, productPrices.size - 1)
}

fun getProductPrices(productPrices: DoubleArray, maxIndex: Int): Double {
    // case base -> recursive limit
    if (maxIndex == 0) return productPrices[0]

    // case recursive
    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex.dec())
}