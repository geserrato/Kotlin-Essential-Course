package funciones

fun main() {
    // "My Fabulous App"
    // "Welcome to the best experience"
    // "Gerardo Estrella"

    // "**** My Fabulous App ****"
    // "** Welcome to the best experience **"
    // "* Gerardo Estrella *"

    val appName = "My Fabulous App"
    println(addStarsFormant(appName, 5))

    val welcome = "Welcome to the best experience"
    println(addStarsFormant(welcome, 4))

    val name = "Gerardo Estrella"
    println(addStarsFormant(name,2))
    println(addStarsFormant(name))
}


fun addStarsFormant(text: String, starsNumber: Int): String {
    val textBuilder = StringBuilder(text)
    textBuilder.insert(0, " ")
    textBuilder.insert(textBuilder.length, " ")
    for (i in 0 until starsNumber) {
        textBuilder.insert(0, "*")
        textBuilder.insert(textBuilder.length, "*")
    }

    return textBuilder.toString()
}
// overload
fun addStarsFormant(text: String): String = addStarsFormant(text, 2)
