package com.kotlin.practice

fun main(args: Array<String>) {

    val employee = Employee("Ankit")
    println(employee)
    val person = Person()
    val person1 = Person(102, "Rahul")
    Add(1, 8)
    Add(1, 2, 5)
    Child("Hello")
}

class Employee(var name: String) {

    var name1: String = ""

    init {
        println("This is first in it block")
    }

    init {
        println("This is second in it block")

    }

    init {
        println("This is third in it block")
    }

    init {
        this.name1 = name
    }
}

class Person(val id: Int = 100, val name: String = "Aniket") {
    var personName: String
    var personId: Int

    init {
        this.personName = name
        this.personId = id
    }

    init {
        println("person name is $personName and id is $personId")
    }
}

class Add {
    constructor(a: Int, b: Int):this(a,b,9) {
        println(a + b)
    }

    constructor(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }
}
open class Parent{
    constructor(a:Int,b:Int,c:Int){
        println("Parent class constructor")
    }
}
class Child:Parent{
    constructor(s:String):super(3,5,6){
        println("Hello")
    }
}