package com.kotlin.practice

fun main(args: Array<String>) {
    val listOfString = listOf<String>("a", "b", "c")
    printThings(listOfString)
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5)
    printThings(listOfNumber)
    val empDto = EmployeeDto(1, "rahul")
    val response = Response(empDto, "1", "saved")
    println(response)
    val listOfShorts: MutableList<Short> = mutableListOf(1, 2, 3, 4)
    //printNumbers(listOfShorts)

    orderPlace(Order<Food>())
    orderPlace(Order<Burger>())
    orderPlace(Order<FastFood>())
}


fun <T> printThings(list: List<T>) {
    for (n in list) {
        println(n)
    }
}

data class Response<T>(var data: T, var code: String, var description: String) {

}

data class EmployeeDto(val id: Int, var name: String) {

}

fun printNumbers( list: MutableList<Number>) {
    for (num in list) {
        println(list)
    }
}

//invariant
interface Production<T>{
    fun hello() :T
    fun hii(item:T)
}


open class Food{

}
open class FastFood:Food(){

}
open class Burger:FastFood(){

}


class Order<in T>{

}

fun orderPlace(order:Order<Burger>){
    println(order.javaClass)
}

