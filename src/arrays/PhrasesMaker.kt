package arrays

fun main() {
//    Saludo + Introduccion + Nombre
//    Hola,hi,bienvenido,welcome,buenos dias,good morning, hallo
//    Introduccion: Mi nombre es, Puedes llamarme, Usualmente me llaman, Yo soy
//    Nombre: Gera, Gerardo, geserrato, starcode, Serrato, Estrella

    val greetings = arrayOf("Hola", "Hi", "Bienvenido", "Welcome", "Buenos días", "Good Morning", "Hallo")
    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("Gera", "Gerardo", "geserrato", "starcode", "Serrato", "Estrella")

    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroductions]} ${names[randIndexNames]}"

    println(phrase)
}