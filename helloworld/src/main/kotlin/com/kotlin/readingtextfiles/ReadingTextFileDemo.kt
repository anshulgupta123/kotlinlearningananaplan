package com.kotlin.readingtextfiles

import java.io.File

fun main(args: Array<String>) {
   val lines= File("testfile.txt").reader().readLines()
    //lines.forEach { println(it) }

    val reader= File("testfile.txt").reader()
    val str=reader.readText()
    //println(str)
    reader.close()

    val reader1= File("testfile.txt").reader().use { it.readText() }
        //println(reader1)

    val reader2= File("testfile.txt").bufferedReader().use { it.readText() }
    //println(reader2)

    val reader3= File("testfile.txt").readText()
    //println(reader3)

    val reader4= File("testfile.txt").reader().forEachLine { println(it) }
    println(reader4)




}