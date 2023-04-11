package com.kotlin

fun main(args: Array<String>) {
    val car = Car("Blue", "Audi", 2034)
    val car2 = Car("Blue", "Audi", 2034)

    println(car)
    val emp1 = Employee5("John")
    val emp2 = Employee5("John")
    println(emp1 == emp2)
    println(car == car2)
    val car3=car.copy()
    val car4=car2.copy(color = "green")
    println(car3)
    println(car4)

}

data class Car(val color: String, var modal: String, var year: Int) {

}

class Employee5(var name: String) {

}