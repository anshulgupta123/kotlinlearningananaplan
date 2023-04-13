package com.kotlin.trycatchexpression

import kotlin.IllegalArgumentException

fun main(args: Array<String>) {

    //println(getNumber2("123"))
    //println(getNumber2("123ew"))
    // val str:Any?=getNumber3("12.5")?: throw IllegalArgumentException("Number is not an int")
    notImplementedYet("Hello");
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: Exception) {
        0
    }
    finally {
        println("I am in the finally block")
    }
}

fun getNumber2(str: String): Int {
    return try {
        Integer.parseInt(str)
    }
    finally {
        println("I am in the finally block")
    }
}

fun getNumber3(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }
    catch (e:Exception){
        null
    }
    finally {
        println("I am in the finally block")
    }
}

fun notImplementedYet(something:String) : Nothing{
    throw IllegalArgumentException("Implement me")
}