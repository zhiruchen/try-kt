fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 2;
    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }

    print("max: "+max+"\n")

    val max1 = if (a > b) a else b
    println("max1 "+ max1)

    when (max1) {
        5 -> println("max is 5")
        2 -> println("max is 2")

        else -> {
            println("max is not 2 or 5")
        }
    }


    val items = mutableListOf(1,2,3,4)
    items.add(4, 100)
    for (item in items) println(item)

    for ((index, item) in items.withIndex()) {
        println("$index, $item")
    }

    var x = 0
    while (x < 10) {
        println(x)
        x++
    }


    val items1 = listOf(listOf(1,2,3,4), listOf(5,6,7,8))
    outer@ for (item in items1) {
        for (innerItem in item) {
            if (innerItem == 4) {
                continue@outer
            }

            println(innerItem)
        }
    }
}