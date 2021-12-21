package funciones

fun main() {
    // Lambda Normal
    val printHola = {
        println("Hola Lambda")
    }
    printHola()

    // Lambda con parametros
    val printText = { text: String ->
        println(text)
    }
    printText("Hola GeraltCode")

    // Lambda que retonra un valor
    val addOneTo = { x: Int ->
        x + 1
    }
    println(addOneTo(5))

    // Lambda implicita
    val addFiveTo: (Int) -> Int = {
        it + 5
    }
    println(addFiveTo(5))

    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _: String ->
        x + y
    }
    println(sum(5, 3, ""))

    val sum2: (Int, Int, String) -> Int = { x: Int, y: Int, message: String ->
        val total = x + y
        println("$message $total")
        total
    }
    sum2(5, 5, "El resultado de la suma es")
}