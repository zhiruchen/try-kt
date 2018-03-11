interface Shape {
    fun getArea(): Double
}

class Square(var l: Double) : Shape {
    override fun getArea(): Double {
        return l * l
    }
}

class Rectangle(var l: Double, var w: Double) : Shape {
    override fun getArea(): Double {
        return l * w
    }
}

class Circle(var radius: Double) : Shape {
    override fun getArea(): Double {
        return 3.14 * radius * radius
    }
}

fun main(args: Array<String>) {
    val shapes = listOf(Square(6.0), Rectangle(3.0, 4.0), Circle(10.11))

    for (shape in shapes) {
        println("the area of shape is: "+shape.getArea())
    }
}