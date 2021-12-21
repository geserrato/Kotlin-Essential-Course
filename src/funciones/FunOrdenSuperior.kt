package funciones

fun main() {
    val isValid = isValid(5) {
        it > 4
    }
    println(isValid)

    consultProductId(onNext = getOnNextProductIdBehavior())
}
// Funcion que recibe una lambda
fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean {
    return validate(x)
}

// funcion que retorna una lambda
fun consultProductId(onNext: (productId: String) -> Unit) {
    val productId = "WERT123"
    onNext(productId)
}

fun getOnNextProductIdBehavior(): ((productId: String) -> Unit) {
    return {
        println("Go to Product Detail Screen with product id: $it")
    }
}