package com.kotlin.forloop

fun main(args: Array<String>) {
    val range = 1..5
    for (i in range) {
        // println(i)
    }
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    // println(3 in range)
    //println('q' in charRange)
    //println("CCC" in stringRange)
    //println("CCCCCCCC" in stringRange)
    //println("ZZZZZZZZZZ" in stringRange)
    val backwardRange = 5.downTo(1)
    val r = 5..1
    //println(5 in r)
    //println(5 in backwardRange)
    val stepRange = 3..15
    val step3 = stepRange.step(3)
    for (n in step3) {
        //  println(n)
    }
    val reversedrange = range.reversed()
    for (z in reversedrange) {
       // println(z)
    }

    for(m in 1..5){
        //println(m)
    }
    val str:String="hello"
    for(u in str){
        //println(u)
    }
    for(f in 1..20 step 4){
       // println(f)
    }
    for(i in 20 downTo  15){
       // println(i)
    }

    for(i in 20 downTo 10 step  5){
      //  println(i)
    }
    //until will exclude 10
    for(i in 1 until 10){
     println(i)
    }
}