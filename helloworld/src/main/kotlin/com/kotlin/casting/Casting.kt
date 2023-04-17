package com.kotlin.casting

fun main(args: Array<String>) {
    val obj:Any=Employee("A",1)
    if(obj is Employee){
        //val newEmployee=obj as Employee
        //println(newEmployee)
        println(obj.name)
        val string="""aaaaaaaaaaaaaaaaaaaaaaaaaa
            |bbbbbbbbbbbbbbbbbbbbb
            |bcbcbfcjhdddddddddd
        """.trimMargin()
        println(string)
    }



}
data class Employee(var name:String,val id:Int){

}
