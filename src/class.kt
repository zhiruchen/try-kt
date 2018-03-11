class KtClass {
    private var name: String = "kotlin class define"
    fun printName() {
        println(name)
    }
}

class Outer {
    private val msg = "msg from outer class"
    class Nested { // static
        fun printMsg() { println("msg from nested class") }
    }

    inner class Nested1() {
        fun printMsg() = msg
    }
}

interface Human {
    fun think()
}

class Person(val firstName: String, var age: Int) {
    var msg: String = "msg from person"
    constructor(name: String, age: Int, msg: String):this(name, age) {
        // some init logic
    }
}


fun main(args: Array<String>) {
    val obj = KtClass()
    obj.printName()

    println(Outer.Nested().printMsg())
    println(Outer().Nested1().printMsg())

    val programmer: Human = object : Human {
        override fun think() {
            println("I am thinking")
        }
    }
    programmer.think()

    var person = Person("xiaoming", 20)
    println("${person.firstName}")
    println("${person.age}")

    person = Person("Jack", 26)
    println("${person.firstName}  ${person.age}  ${person.msg}")
}