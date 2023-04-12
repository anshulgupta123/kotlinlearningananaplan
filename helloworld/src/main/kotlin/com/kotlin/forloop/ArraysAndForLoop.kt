package com.kotlin.forloop

fun main(args: Array<String>) {

    val seasons = arrayOf("winter", "summer", "spring", "fall")

    for (season in seasons) {
        //println(season)
    }

    val notAseasson = "whatever" !in seasons
    //println(notAseasson)

    val notInrange = 32 !in 1..10
    // println(notInrange)

    val str = "Hello"
    // println('e' !in str)
    //println('e' in str)

    for (index in seasons.indices) {
        //println("${seasons[index]} is season number $index")
    }

    //seasons.forEach { println(it) }
    //seasons.forEachIndexed{index,value-> println("$value season number is $index") }
    for (i in 1..10) {
        println("i is $i")
       jloop@ for (j in 1..10) {
            println("j is $j")
            for (k in 1..10) {
                println("k is $k")
                if(k==7){
                    break@jloop
                }
            }
        }
    }
}