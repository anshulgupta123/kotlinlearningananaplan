package com.kotlin.selfillustration


fun main(args:Array<String>){
    var employeeList= arrayListOf<Employee>(Employee("akg3",200,"akg1@gmaul.com"),
        Employee("akg4",200,"akg1@gmaul.com"),Employee("akg5",200,"akg1@gmaul.com"))
    println(employeeList)
}

class Employee(var name:String,var id : Long,var email:String){
    override fun toString(): String {
        return "Employee(name='$name', id=$id, email='$email')"
    }
}