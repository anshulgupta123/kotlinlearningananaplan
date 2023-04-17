package com.kotlin.referentailandstructuralequality


fun main(args: Array<String>) {
    val employee1=Employee("A",1)
    val employee2=Employee("B",1)
    val employee3=Employee("A",1)
    val employee4=employee1
    println(employee1==employee2)
    println(employee1==employee3)
    println(employee2==employee3)
    println(employee4==employee1)
    println(employee1.equals(employee2))
    println(employee1.equals(employee3))
    println(employee1===employee3)
    println(employee4===employee1)
    println(employee1!=employee3)
    println(employee1!==employee3)



}
 data class Employee(var name:String,val id:Int){

}