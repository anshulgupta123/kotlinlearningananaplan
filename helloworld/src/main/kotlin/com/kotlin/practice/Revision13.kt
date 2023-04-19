package com.kotlin.practice

fun main(args: Array<String>) {

    var arr = arrayOf(1, 2, 3, 4, 5)
    val sum = 0
    //  println(arr.asList().asSequence().reduce({ x, y -> x + y }))
    var emptyList = emptyList<Int>()
    //println(emptyList.asSequence().fold(0) { x, y -> x + y })
    var list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //println(list2.asSequence().filter { x -> x % 2 == 0 }.toList())
    //println(list2.asSequence().filter { x -> x % 2 != 0 }.toList())
    //println(list2.asSequence().map { x -> x * x }.toList())
    val department = DepartMent10("Dev")
    //println(department)
    val departMent1 = DepartMent10("Qa")
    val departMent2 = DepartMent10("hr")
    val departMent3 = departMent1
    val departMent4 = DepartMent10("Dev")
    //println(departMent4 == department)
    //println(departMent4.equals(department))
    //println(departMent4 === department)
    //println(departMent3 === departMent1)
    val str: String? = null
    //println(str?.uppercase())
    //println(str!!.uppercase())

    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    val mutableListOfNumber = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
    mutableListOfNumber.add(7)
    println(mutableListOfNumber)

    val setOfNumber = setOf<Int>(1, 2, 3)
    println(setOfNumber.plus(4))
    println(setOfNumber)

    val mutableSetOfNumber = mutableSetOf<Int>(8, 9)
    println(mutableSetOfNumber.add(10))
    println(mutableSetOfNumber)

    val map = mapOf<Int, String>(1 to "Abc", 2 to "hfgf")
    println(map.plus(5 to "jsjshs"))
    println(map)

    val mutableMap = mutableMapOf<Int, String>(1 to "hello", 2 to "hii")
    println(mutableMap.put(5, "good mornong everyone"))
    println(mutableMap)

}

data class DepartMent10(val name: String) {

}