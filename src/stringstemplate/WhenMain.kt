package stringstemplate

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true

    when (isLoggedIn) {
        true -> println("Usuario logeado")
        false -> println("Usuario no logeado")
    }

    println()

    // 1  logged in
    // 0  logged out
    // -1  Down
    // 10 - 20 Inactive time
    val userStatus = 17
    val userStatusString = when (userStatus) {
        0 -> "Logged Out"
        1 -> "Logged In"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus minutes"
        else -> "Not found"
    }

    println(userStatusString)
    println()


    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("Totals: $total")


    val hasAddress = false
    val user = "geserrato"
    val statusUser = when {
        isLoggedIn and hasAddress -> "Lista de direcciones del usuario: $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else -> ""
    }

    println("message: $statusUser")
}