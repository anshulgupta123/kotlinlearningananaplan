package com.kotlin.declaringclassesandconstructors

fun main(args: Array<String>) {
    val employee=Employee1("Anshul",true)
    println(employee
        .firstName)
    println(employee.isFullTime)
    val employee1=Employee1("ankit",false)
    println(employee1.firstName)
    println(employee1.isFullTime)
}


class Employee1(val firstName:String){
    var isFullTime:Boolean=true
    constructor(firstName: String,isFullTime:Boolean) :this(firstName){
        this.isFullTime=isFullTime
    }
}