package com.kotlin.practice

fun main(args: Array<String>) {
    val employee1 = Employee15("ak1", 1, 65000.00, "dev")
    val employee2 = Employee15("ak2", 2, 75000.00, "dev")
    val employee3 = Employee15("ak3", 3, 85000.00, "hr")
    val employee4 = Employee15("ak4", 4, 55000.00, "hr")
    val employee5 = Employee15("ak5", 5, 78000.00, "qa")
    val employee6 = Employee15("ak6", 6, 89000.00, "qa")
    val listOFEmployee = listOf<Employee15>(employee1, employee2, employee3, employee4, employee5, employee6)
    //println(listOFEmployee.asSequence().filter { x->x.id==5 }.toList())
    //println(listOFEmployee.asSequence().filter { x->x.id>3 }.map { x->x.department }.toList())
    //println(listOFEmployee.asSequence().sortedBy { x -> -x.id }.toList())
    //println(listOFEmployee.asSequence().sortedBy { x -> x.id }.toList())
    //println(listOFEmployee.asSequence().sortedByDescending { x->x.department }.toList())
    // println(listOFEmployee.asSequence().groupBy { x -> x.department })
    //println(listOFEmployee.asSequence().maxBy { x->x.salary })
    //println(listOFEmployee.asSequence().minBy { x->x.salary })

}

data class Employee15(val name: String, val id: Int, val salary: Double, val department: String) {

}