package com.kotlin.declarations

typealias EmployeeSet=Set<Employee>

fun main(args:Array<String>){
    println("Declarations")
    var number=10
    number=10
    val employee=Employee("anshul",1)
    //here we are setting employee name
    employee.name="aman"
    println(employee)
    //here we are using type alias for employees set
    var employees:EmployeeSet
    var names= arrayListOf<String>("anshul","avi","atul")
    println(names[0])

}

class Employee(var name :String,val id:Int){

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}