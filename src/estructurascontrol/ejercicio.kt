package estructurascontrol

fun main() {
    val greetings = arrayOf("Hola", "Hi", "Bienvenido", "Welcome Back", "Buenos días", "Good Morning", "Hallo")
    val phraseWelcome = greetings[(Math.random() * greetings.size).toInt()]
    val usuario = "pain"
    val pass = "nagato"

    print("Ingrese su usuario: ")
    val username = readLine().toString()
    print("Ingrese su contraseña: ")
    val password = readLine().toString()

    if (username == usuario && password == pass) {
        println("$phraseWelcome $usuario")
    } else {
        println("Lo siento el usuario: $username o la clave: $password estan incorrectos")
    }
}