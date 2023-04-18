package com.kotlin.practice

fun main(args: Array<String>) {

    val printer = Printer { println("hello") }
    println(printer.print())
    var x: Int = 100
   val y= when (x) {
        100 -> {
            println(100)
            x + 100
        }

        200 -> {
            println(200)
            x + 100
        }

       else -> {
           500
       }
   }
    println(y)

}

fun interface Printer {
    fun print()
}

class A : Printer {
    override fun print() {
        TODO("Not yet implemented")
    }

}

interface SuperPrinter {
    fun prinNice() {
        println(" nice printer")
    }
}