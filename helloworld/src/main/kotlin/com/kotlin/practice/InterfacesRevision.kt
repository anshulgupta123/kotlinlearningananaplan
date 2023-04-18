package com.kotlin.practice

fun main(args: Array<String>) {
    val c = C()
    c.hello()
    c.hi()
    println(c.x)
    VehiccleDemo().insurance()
}

interface P {
    val x: Int
    fun hello()
    fun hi() {
        println("Hii in P")
    }

}

class C : P {
    override val x: Int
        get() {
            return 50
        }

    override fun hi() {
        println("Hii in c")
    }

    override fun hello() {
        println("Hello in c")
    }

}

interface Vehicle {
    fun insurance() {
        println("Vehicle insurance")
    }
}

interface Car {
    fun insurance() {
        println("Car insurance")
    }
}


class VehiccleDemo : Vehicle, Car {
    override fun insurance() {
        super<Car>.insurance()
    }
}