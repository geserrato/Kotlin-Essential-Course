package arrays

fun main() {
    // Sintaxis Array
    // Optimos en ordenamiento y búsqueda de datos
    // Los array tienen indice iniciando desde 0 hasta el tamaño del array menos 1 -> n-1
//    val numeros = arrayOf(1,2,3)
//    println(numeros[1])
//    println(numeros.size)

    // Kotlin nos permite poner diferentes tipos de datos en un arreglo
    // arrayOf = un array generico que puede tener cualquier valor
//    val myArray = arrayOf(1, "Hola", 'a', 2.5F, 1000L, true)
//    println(myArray[1])
//
//    // Para alterar el dato seria
//    myArray[1] = "adios"
//    println(myArray[1])
//
//    println(myArray[2])
//    println(myArray[3])
//    println(myArray[4])
//    println(myArray[5])

    // Array empty declaramos el tipo de datos que vamos a almacenar
//    val emptyArray = emptyArray<Int>()

    //para definir un tipo de array agregamos el tipo de dato antes de arrayOf
    // dentro del () podemos ingresar el size del arreglo
    // byteArrayOf(2)
    // shortArrayOf(5)
    // intArrayOf(6)
    // longArrayOf(8)
    doubleArrayOf()
    floatArrayOf()

//    val myByteArray = byteArrayOf(1, 2, 3)
//    val myIntArray = intArrayOf(4, 5, 6, 7, 8)
//
//    val arrayInt = IntArray(5)

    // Podemos inicializar de dos maneras un array
    // la primera seria indicando el size
    // y la segunda indicando el size pero ademas pasando un comportamiento (lambda)
    // como el ejemplo de abajo

    // *** la funcion inc incrementa en uno el valor
    // val arrayInt2 = IntArray(5) { i: Int -> i.inc() }
    // arrayInt2.forEach {
    //     println(it)
    // }

//    val arrayBoolean = BooleanArray(3) {
//        println(it)
//        true
//    }
//
//    arrayBoolean.forEach {
//        println(it)
//    }
}