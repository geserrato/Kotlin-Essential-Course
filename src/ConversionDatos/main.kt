package ConversionDatos

fun main() {
    val producLowStock: Byte = 20

    val productStock: Int = producLowStock.toInt()
    println(productStock)

    val numberString = "1"
    val numberByte: Byte = numberString.toByte()

    println("El numero en byte es: $numberByte")

    val numberDouble = numberString.toDouble()
    println(numberDouble)

    // ♡ 0x2661
    // ❤ 0x2764
    val unicodeInt = 0x2661
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()

    println(unicode)
}