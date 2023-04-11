package com.kotlin.arraysnullreferences

fun main(args:Array<String>){
    var nullableArrayOfInts= arrayOfNulls<Int?>(5)
    for(number in nullableArrayOfInts){
        println(number)
    }
    println(nullableArrayOfInts[3])
}