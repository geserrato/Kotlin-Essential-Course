package estructurascontrol

fun main() {
    for (i in 0..4) {
        println(i)
    }

    println()
    for (i in 0.rangeTo(5)) {
        println(i)
    }

    println()
    for (i in 'a'..'g') {
        println(i)
    }

    println()
    for (i in 'g'.downTo('a')) {
        println(i)
    }

    println()
    val greetings = arrayOf("Hola", "Hi", "Bienvenido", "Welcome", "Buenos días", "Good Morning", "Hallo")
    for (greeting in greetings) {
        println(greeting)
    }

    println()
    for (i in 0..greetings.size - 1) {
        println(greetings[i])
    }

    println()
    for (i in greetings.indices) {
        println(greetings[i])
    }

    println()
    for (i in 0 until greetings.size) {
        println(greetings[i])
    }
}