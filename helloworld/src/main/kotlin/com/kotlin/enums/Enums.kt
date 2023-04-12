package com.kotlin.enums

fun main(args: Array<String>) {

    println(Department.ACCOUNTING.getDeptInfo())
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human resources", 5), IT("Information Technology", 100), ACCOUNTING("Accounting", 5),
    SALES("Sales", 45);

    fun getDeptInfo()="The $fullName department has $numEmployees employees"
}