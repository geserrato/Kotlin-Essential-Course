package estructurascontrol

fun main() {
    print("Ingrese la temperatura: ")
    val temperature = readLine()!!.toInt()

    val result = when {
        temperature <= 20 -> "Usa un Abrigo hace frío"
        temperature in 21..30 -> "Te irá bien si usas una Chaqueta, el clima es templado"
        else -> "Es mejor que lleves algo ligero, hace calor"
    }

    println(result)
}