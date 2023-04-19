package com.kotlin.practice

fun main(args: Array<String>) {
    val h1 = H1()
    println(h1.x)
    println(h1.hi())

    val h2 = H2()
    println(h2.x)
    println(h2.hi())

    val student = Student("ankit")
    println(student.cacheName)
    student.cacheName = "Rahul"
    println(student.cacheName)
}

open class H {
    open fun hi() {
        println("Hii h")
    }
}

open class H1 : H() {

    open val x: Int = 10
    override fun hi() {
        println("Hello h1")
    }
}

class H2 : H1() {
    override val x: Int = 50
    override fun hi() {
        println("Hello h2")
    }
}

class Student(val name: String) {
    var cacheName: String = ""
        get() {
            println("get executed")
            return field
        }
        set(value) {
            println("set executed")
            field = value
        }

    init {
        cacheName = name
    }
}