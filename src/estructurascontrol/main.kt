package estructurascontrol

fun main() {
    val isLoggedIn = false
    val hasAddress = true

    if (isLoggedIn) {
        println("Usuario está logeado")
        if (hasAddress) {
            println("El usuario tiene direcciones")
        } else {
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logeado")
    }

    val userLoggedInStatus = if (isLoggedIn) "Logeado" else "No Logeado"

    println(userLoggedInStatus)
}