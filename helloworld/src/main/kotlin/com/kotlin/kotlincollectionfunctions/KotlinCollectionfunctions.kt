package com.kotlin.kotlincollectionfunctions

fun main(args: Array<String>) {
    val string = listOf<String>("winter", "summer", "summer", "spring", "fall")
    val colors = listOf<String>("white", "black", "green", "black")
    val mutableSeasons = string.toMutableList()
    val mutableColors = colors.toMutableList()
    mutableSeasons.add("another season")
    println(mutableSeasons)
    println(string.last())
    println(string.first())
    println(string.asReversed())
    if (string.size > 5) {
        println(string[5])
    }
    println(string.getOrNull(5))

    val ints = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(ints.max())
    println(ints.min())
    println(colors.zip(string))

    val mergedList = listOf(colors, string)
    println(mergedList)

    val combinedList = colors + string
    println(combinedList)

    val noDulpicatesList = colors.union(string)
    println(noDulpicatesList)

    val noDupColors = colors.distinct()
    println(noDupColors)
}