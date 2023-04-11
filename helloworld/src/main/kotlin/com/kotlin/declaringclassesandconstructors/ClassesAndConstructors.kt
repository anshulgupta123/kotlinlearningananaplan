package com.kotlin.declaringclassesandconstructors

fun main(args: Array<String>) {
val employee=Employee("John")
    println(employee)
    println(employee.firstName)
}

class Employee internal constructor(val firstName:String){



}