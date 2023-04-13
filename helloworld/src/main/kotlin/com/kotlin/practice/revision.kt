package com.kotlin.practice

fun main(args: Array<String>) {


    val employee=Employee("Aaksh")
    employee.name1="Anshul"
    println(employee.name1)
}


class Employee(var name:String){

    var name1=""
        get() {
            println("Customized get method called")
            return field;
        }
        set(value) {
            println("customized set method called")
            field=value
        }
}
