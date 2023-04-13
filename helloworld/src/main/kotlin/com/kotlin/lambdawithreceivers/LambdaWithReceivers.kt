package com.kotlin.lambdawithreceivers

import com.kotlin.lambdaexpressionbasics.Employee
import kotlin.text.StringBuilder


fun main(args: Array<String>) {
    val employees = listOf<Employee>(
        Employee("ak", "gupta", 2022),
        Employee("aman", "tyagi", 2022),
        Employee("ram", "panchal", 2021),
        Employee("akshi", "bansal", 2019)
    )
   // println(countV5To100())
  //findByLastName2(employees,"gupta")
    //findByLastName2(employees,"sharma")
    "Some String".apply  somestring@{
        "Another String".apply {
         println(toLowerCase())
            println(this@somestring.toUpperCase())
        }
    }

}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countV2To100(): String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}


fun countV3To100(): String {
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countV4To100() = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

fun countV5To100() = StringBuilder().apply() {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()

fun findByLastName(emloyees:List<Employee>,lastName:String){
    for(employee in emloyees){
        if(employee.lastName==lastName){
            println("Yes there is an employee with last name $lastName")
            return
        }
    }
    println("there is no  employee with last name $lastName")
}

fun findByLastName2(emloyees:List<Employee>,lastName:String){
    emloyees.forEach {
        if(it.lastName==lastName){
            println("Yes there is an employee with last name $lastName")
            return
        }
    }
    println("there is no  employee with last name $lastName")
}

fun findByLastName3(emloyees:List<Employee>,lastName:String){
    emloyees.forEach returnBlock@{
        if(it.lastName==lastName){
            println("Yes there is an employee with last name $lastName")
            return@returnBlock
        }
    }
    println("there is no  employee with last name $lastName")
}

