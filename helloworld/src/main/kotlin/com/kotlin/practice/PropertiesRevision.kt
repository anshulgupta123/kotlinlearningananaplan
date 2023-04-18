package com.kotlin.practice

import kotlin.io.path.fileVisitor

fun main(args: Array<String>) {
    val emp = Employee10("Ankit")
    println(emp.empName)
    emp.empName = "Rahul"
    println(emp.empName)

}

class Employee10(val name: String) {
    var empName: String = ""
        get() {
            println("get method called")
            return field;
        }
        set(value) {
            println("setter method called")
            field = value
        }
}
