package com.kotlin.extensionfunctions

import com.kotlin.utils.Utils


fun main(args: Array<String>) {
    //println(Utils().upperFistAndLastLetter("this is all in lower case"))
    val str:String="this is all in lower case"
   // println(str.upperFistAndLastLetter2())
    println(str.upperFistAndLastLetter3())


}

fun String.upperFistAndLastLetter2(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).toUpperCase()
}

fun String.upperFistAndLastLetter3(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).toUpperCase()
}