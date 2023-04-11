package com.kotlin.propertiesandbackingfields


val My_CONSTATNT=100
fun main(args: Array<String>) {
    println(My_CONSTATNT)
    val employee=Employee4("John",true)
    println(employee.isFullTime)
    employee.isFullTime=false
    println(employee.isFullTime)
}

class Employee4(var name:String,isFullTime:Boolean=true){

    var isFullTime=isFullTime
        get(){
            println("running the custom get")
            return field
        }

        set(value) {
            println("running the custom set")
            field = value

        }
}