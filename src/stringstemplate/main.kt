package stringstemplate

fun main() {
    val price = 15.25
    val tax = 0.16

    // Cuando colocamos el simbolo $$ inferimos que queremos imprimir el primer $ como string
    val out = "La cantidad de $price después de impuestos es: $${price * (1 + tax)}"

    println(out)

    val disclaimer = "La cantidad esta en \$MXN"
    println(disclaimer)

    val total = price.times(tax.plus(1))
    println(total.toFloat())

    // Metodos de conversion
    // La unica restriccion es que no podemos convertir a Booleon

    // toDouble()
    // toFloat()
    // toLong()
    // toInt()
    // toChar()
    // toShort()
    // toByte()
}