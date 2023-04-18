package com.kotlin.practice

fun main(args: Array<String>) {

    val child = Child1()
    child.hello()
    child.parent()
    val parent = Parent1()
    parent.parent()
    println(child.x)
    println(parent.x)
    Shape().draw()
}

open class Parent1 {
    open val x: Int = 10
    open fun parent() {
        println("Parent function")
    }

    fun hello() {
        println("hello")
    }
}

open class Child1 : Parent1() {
    final override val x: Int = 20
    final override fun parent() {
        println("Parent overridden")
    }
}

class Child2 : Child1() {

}

open class Polygon {
    open fun draw() {
        println("Polygon draw function")
    }
}

interface Rectangle {
    open fun draw() {
        println("Rectangle draw")
    }
}

class Shape : Polygon(), Rectangle {
    override fun draw() {
        super<Rectangle>.draw()
    }
}