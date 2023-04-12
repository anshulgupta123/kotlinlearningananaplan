package com.kotlin.inlinefunctions

fun main(args: Array<String>) {
    println(multiply(3,5))
}

inline fun multiply(x:Int,y:Int):Int=x*y