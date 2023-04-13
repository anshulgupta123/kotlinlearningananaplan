package com.kotlin.List

fun main(args: Array<String>) {
    val strings = listOf<String>("summer", "winter", "fall", "spring")
    println(strings.javaClass)
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    println(strings.get(0))
    val notNullList = listOfNotNull("hello", null, "hii")
    println(notNullList)

    val arrayList= arrayListOf<String>("A","v","d")
    println(arrayList.javaClass)

    var mutableList= mutableListOf<Int>(1,2,3,4,5)
    println(mutableList.javaClass)

    val arrayOfInt= arrayOf(1,2,3,4,5)
    val convertedList= listOf(*arrayOfInt)
    convertedList.forEach{println(it)}
   val convertedList2=arrayOfInt.toList()
    println(convertedList2)

    val intArray= intArrayOf(10,11,12,13)
    println(intArray.toList())

}