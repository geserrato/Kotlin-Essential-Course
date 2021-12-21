package funciones

// Funcion Main
fun main() {
    showWelcomeMessage("Buenos dias")
    // Argumentos nombrados
    showWelcomeMessage("Welcome", user = "geserrato")
}

// Argumentos por default
fun showWelcomeMessage(text: String, user: String = "") {
    val message = "$text $user".trim()
    println(message)
}

// Funciones infix
//  Si creas una funcion infiz puedes llamarla sin la notacion punto
//  isLoggedIn.and(hasAddress)
//  isLoggedIn and hasAddress
//  la funcion and es una funcion infix
//  class Boolean {
//    infix fun and(other:Boolean):Boolean {
//      ...
//    }
// }