package com.kotlin.lambdaexpressionbasics

fun main(args: Array<String>) {
    run { println("i am a lambda expression") }
    val employees = listOf<Employee>(
        Employee("ak", "gupta", 2022),
        Employee("aman", "tyagi", 2022),
        Employee("ram", "panchal", 2021),
        Employee("akshi", "bansal", 2019)
    )
   // println(employees.minBy { e -> e.startYear })
    //println(employees.minBy { e: Employee -> e.startYear })
    //println(employees.minBy { it.startYear })
  //  println(employees.minBy (Employee::startYear ))


    var num=10
    run{
        num+=15
      //  println(num)
    }

   // useParameter(employees,100)

    run(::toplevel)
}

fun useParameter(employees:List<Employee>,num:Int){
    employees.forEach{
        println(it.firstName)
        println(num)
        //not aloowed
        //println(num++)
    }
}
fun toplevel()= println("I am in a function")
data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}