package funciones

fun main() {
    val welcome = cleanText(getWelcomeText())
    println(welcome)
}

private fun getWelcomeText(): String = "** Welcome to the best experience **"

fun cleanText(text: String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()