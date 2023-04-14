package com.kotlin.set

fun main(args: Array<String>) {
    val setOfInts = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
   // println(setOfInts.plus(10))
    //println(setOfInts.plus(180))
    //println(setOfInts)

    val mutableList= mutableListOf<Int>(1,2,3,4,5)
    mutableList.add(6)
    //println(mutableList)
    val immutableList= listOf<Int>(1,2,3,4,5)

    //println(immutableList)
    val immutableMap= mapOf<Int,Int>(1 to 10,2 to 6)
    val mutableMap= mutableMapOf<Int,Int>(1 to 10,2 to 6)
    mutableMap.put(4,80)
    //println(mutableMap)
   println(setOfInts.minus(9))
    println(setOfInts.minus(0))
    println(setOfInts.average())
    println(setOfInts.drop(3))

    val mutableSet= mutableSetOf<Int>(100,200,300,400)
   println(mutableSet.plus(500))
    println(mutableSet)
}