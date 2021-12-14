package estructurascontrol

fun main() {

    val greetings = arrayOf("Hola", "Bienvenido", "Welcome", "Hi", "Buenos días", "Good Morning", "Hallo")

    var i = 0
    while (i <= greetings.size - 1) {
        println(greetings[i])
        i++
    }

    println()

    var j = 0
    do {
        val greeting = greetings[j]
        println(greeting)
        j++
    } while (greeting.length > 2 && j < greetings.size - 1)
    println("Continuando")

    var k = 0
    while (k <= greetings.size - 1) {
        val greeting = greetings[k]
        println(greeting)
        k++
        if (greeting.length <= 2) break
    }

    println("Termino While")
}
