package com.kotlin.genericsinkotlin

import java.math.BigDecimal

fun main(args: Array<String>) {
    val listOFString: MutableList<String> = mutableListOf("Hello")
    listOFString[0].toUpperCase()
    listOFString.add("another string")
   // printCollection(listOFString)
    val bdList = mutableListOf<BigDecimal>(
        BigDecimal(100.00),
        BigDecimal(-10.00), BigDecimal
            (50), BigDecimal
            (89)
    )
    //printCollection1(bdList)
    listOFString.printCollection3()
    bdList.printCollection3()
}

fun printCollection(collection: List<String>) {
    collection.forEach { println(it) }
}

fun <T> printCollection1(collection: List<T>) {
    collection.forEach { println(it) }
}

fun <T> List<T>.printCollection3() {
    this.forEach { println(it) }
}