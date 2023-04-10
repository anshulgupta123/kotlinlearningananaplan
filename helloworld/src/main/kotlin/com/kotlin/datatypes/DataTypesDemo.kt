package com.kotlin.datatypes

import com.kotlin.javacode.DummyClass

fun main(args: Array<String>) {
    var x=10
    println("defaukt data type is :${x is Int}")
    println(x)
    var y:Int=10
    println(x)
    var z=25L
    println(z)
    var m: Long=80
    println(80)
    //there is not widening in kotlin
    //  z=x
    //how to solve that
    z=x.toLong()
    println(z)
    println("data type of z is Long  ${z is Long}")
    var d=90.889
    println("data type of d is double :${d is Double}")
    var e=890.887f
    println("data type of e is float:${e is Float}")

    var char='b'
    println(char)

    var mychar=65
    //it will work fine beacuse compiler will understabd it the integer value

    var mycharint=65

    //kotlin consider character as character
    //var f :Char=65

    var c=mycharint.toChar()
    println(c)

    var mybooleantrue=true
    println("Data type is boolean :${mybooleantrue is Boolean}")
    var mybooleanfalse=false
    println("Data type is boolean :${mybooleanfalse is Boolean}")

 //   var myTestBooelan :Boolean=absgd
    val vacationTime=DummyClass().isOnVacation(mybooleanfalse)
    println(vacationTime)

    var anything:Any="abc"
    println(anything)

}