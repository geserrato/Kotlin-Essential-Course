package tiposdatos

fun main() {

    // *** Numeros Enteros

    // Byte -127 -> 128
    val age = 20
    val newAge: Byte = 127
//    age = 21

    // Int
    // 2 mil millones
    val productId = 2147483747
    val productId2 = 2_147_483_747 // kotlin nor permite separar numeros en miles con un guin bajo
    // val productId3: Int = 2_147_483_748

    // Long
    // 9 trillones
    val userId: Long = 9_223_372_036_854_775_807
    val userId2 =
        9_223_372_036_854_775_807L // Otra manera de determinar un valor Long agregando al final de los numeros la L mayuscula


    // *** Numeros Decimales Flotantes
    // Float  6-7 decimales
    // Double 15 - 16 decimales
    // Por defecto el compilador lo interpreata como Double cuando se infiere el tipo de dato
    // Para declarar un numero Flotanto de debe colocar una F al final del numero SIEMPRE
    // BigInteger y BigDecimal son tipo de datos que son usados cuando se requiere demasiada presicion (Dinero Aplicaciones de negocios)

    val myDouble = 2.12345678911234567 // 17 decimales
    val myFloat = 2.12345678911234567F

   // println(myDouble)
   // println(myFloat)

    // *** Booleans
    // Son valores que solo almacenan un tipo valor verdadero (True) o Falso (False) y son de una longuitud de 1 Byte
    // Operaciones que podemos utilizar
    // * And && and
    // * Or  || or
    // * Not ! not

    val isLoggedIn = true
    val hasAddress = false

    // Conbinacion de valores

    // And
    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = true

    // ** Or
    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false

    // ** Not
    // !true = false
    // !false = true

    //    println(isLoggedIn && hasAddress)
    //    println(isLoggedIn.and(hasAddress))
    //    println(isLoggedIn and hasAddress)
    //    println(!isLoggedIn)
    //    println(isLoggedIn.not())

    // *** Characters
    // Este tipo de variables son diferentes a los String porque se utiliza comilla simple y su magnitud es de 2 charts
    // podemos usar algunas secuencias de escape
    // \t -> \'
    // \b -> \"
    // \n -> \\
    // \r -> \$

//    val keyInserted = 'a'
//    println(keyInserted)
//    println('\$')
//    println('\'')


    // *** Strings
    // Secuencia de Caracteres
    // Charsequence
    // Los strings templates son muy comun utilizados para dar formato a algunos textos utilizando el signo $

    val name = "Gerardo"
    val lastName = "Estrella"
    val fullName = "Name: $name $lastName" // Primer manera utilizada
    // val fullName2 = "Name: ${person.name}"
    // Segunda forma es cuando obtenemos el valor de algun objeto en particular
    // incluso ingresar operaciones condicionales (o codigo mas complejo) (mas no se recomienda por el clean code)

    // *** Objetos
    // Todos los tipos de datos en Kotlin son Objetos
    // Un objeto va tener Estado y un comportamiento


}