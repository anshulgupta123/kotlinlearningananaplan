package com.kotlin.singleton

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunication.tageLine())
    println(CompanyCommunication.getCopyRightLine())
}

fun topLevel(str:String)="top level function is : ${str}"

object  CompanyCommunication{


    val currentYear=Year.now().value
    fun tageLine()="Our company rocks"
    fun getCopyRightLine()="copyright at the $currentYear our company copyrigths reserved"
}