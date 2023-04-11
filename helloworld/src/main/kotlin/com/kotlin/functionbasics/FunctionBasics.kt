package com.kotlin.functionbasics

fun main(args: Array<String>) {
    //println(labelMultiply(5, 3, "The result is"))
    //println(labelMultiply2(5, 3, "The result is"))

    //var employee = Employee6("john")
    //println(employee.upperCaseName())
    //println(labelMultiply(label = "The answer is ", x = 9, y = 8))
    val car=Car("blue","audi",2034)
    val car1=Car("red","audi",2034)
    val car2=Car("white","audi",2034)
    val car3=Car("brown","audi",2034)
   // printcars(car,car1,car2,car3)
   // printcars1(car,car1,car2,car3,str="hello")
    var arrayOfCars= arrayOf(car,car1,car2,car3)
   // printcars(*arrayOfCars)
    var car5=car3.copy()
    var car6=car2.copy()
    var somemorearray= arrayOf(car5,car6)
    var lotsOfCars= arrayOf(*arrayOfCars,*somemorearray)
    for(car in lotsOfCars){
        println(car)
    }


}


fun whatever() = 3 * 4

fun labelMultiply(x: Int, y: Int, label: String): String {
    println(x + y)
    println(x - y)
    println(label)
    println(x)
    println(y)
    return "$label ${x * y}"
}

fun printcars(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun printcars1(vararg cars: Car,str:String) {
    for (car in cars) {
        println(car.color)
    }
    println(str)
}

fun labelMultiply2(x: Int, y: Int, label: String) = "$label ${x * y}"

class Employee6(val firstName: String) {
    fun upperCaseName() = firstName.uppercase()
}

data class Car(var color: String, var modal: String, var year: Int) {

}