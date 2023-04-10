package com.kotlin.arrays

import com.kotlin.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val x = arrayOf("anshul", "rohit", "rajeev")
    val y = arrayOf<Long>(1L, 2L, 3L)
    val z = arrayOf(1, 2, 3)
   // println(x)
    //println(y is Array<Long>)
    //println(z is Array<Int>)
    //println(y[2])
    // println(y[10])

    //decelaration of array with the help of lamnda expressions
    val evenNumbersArray = Array(16) { i -> i * 2 }
    for (number in evenNumbersArray) {
        //println(number)
    }

    val arrayDec :Array<Int>
    arrayDec= arrayOf(1,2,3,4,5)
    for(g in arrayDec){
        //println(g)
    }


    //any is like object class in java
    var mixedArray= arrayOf("gdgdg",'c',BigDecimal(10.5))
    for(elements in mixedArray){
      //  println(elements)
    }
    println(mixedArray.isArrayOf<Any>())
    val callingArray= intArrayOf(1,2,3,4,5)
  //  DummyClass().printArray(callingArray)

    //we cannot do like below
   // var someOtherArray=Array<Int>(5)


    var someOtherArray=IntArray(5)
    for(default in someOtherArray){
        println(default)
    }


}