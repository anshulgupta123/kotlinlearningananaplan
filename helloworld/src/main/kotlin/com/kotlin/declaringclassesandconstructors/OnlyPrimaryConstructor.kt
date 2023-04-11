package com.kotlin.declaringclassesandconstructors

fun main(args: Array<String>) {

    val employee=Employee2("Rahul",false)
    println(employee.name)
    println(employee.isFullTime)
    val dummy=Dummy();
    println(dummy.dummy)
}

class Employee2(var name:String,var isFullTime :Boolean=true){

}

class Dummy{
    val dummy:String

    constructor(){
        dummy="dummy"
    }
}