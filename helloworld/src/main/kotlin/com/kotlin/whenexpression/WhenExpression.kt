package com.kotlin.whenexpression

import java.math.BigDecimal

enum class Season{
    SPRING,SUMMER,FALL,WINTER
}

fun main(args: Array<String>) {
    val num = 499
    when (num) {
        100, 600 -> println(600)
        200 -> println(200)
        300 -> println(300)
        in 400..500 -> println("in range 400 to 500")
        else -> println("Does not match anything")
    }
    val z = 110
    val y = 10
    when (z) {
        y + 90 -> println(100)
        y + 100 -> println(110)
    }

    val obj: Any = "This is a string"
    val obj2 = BigDecimal(10.5)
    val obj3 = 45;
    val someThing: Any = obj3;
    if (someThing is String) {
        println(someThing.uppercase())
    } else if (someThing is BigDecimal) {
        println(someThing.add(BigDecimal(10.7)))
    } else if (someThing is Int) {
        println(someThing - 10)
    }

    val g = when (someThing) {
        is String -> {
            println(someThing.uppercase())
            1
        }

        is BigDecimal -> {
            println(someThing.add(BigDecimal(10.7)))
            2
        }

        is Int -> {
            println(someThing - 10)
            3
        }

        else -> {
            println("I have no idea")
            4
        }

    }
    println("g is $g")

    val timeOfYear=Season.WINTER
    val str =when(timeOfYear){
        Season.SUMMER->{
            "It is hot"
        }
        Season.WINTER->{
            "It needs a cot"
        }
        Season.FALL-> {
            "It is cool"
        }
        Season.SPRING-> {
            "It is flower"
        }
        else-> println("no match")
    }
    println("Time of year is $str")
}

