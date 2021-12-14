package estructurascontrol

import kotlin.system.measureNanoTime

fun main() {
    val forInRange = measureNanoTime {
        for (i in 0..1000) {
            i
        }
    }

    val forEachRange = measureNanoTime {
        (0..1000).forEach {
            it
        }
    }

    println("forInRange: $forInRange")
    println("forEachRange: $forEachRange")

    val objecList = (0..1000).toList()

    val forInList = measureNanoTime {
        for (i in objecList) {
            i
        }
    }

    val forEachList = measureNanoTime {
        objecList.forEach { it }
    }

    println("forInList: $forInList")
    println("forEachList: $forEachList")

}