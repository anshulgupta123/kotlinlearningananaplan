package com.kotlin.anonymousobjects

fun main(args: Array<String>) {

    var thisIsMutable=45
    wantSomeInterface(object : SomeInterface {
        override fun mustimplement(num: Int): String {
           thisIsMutable++
            return "This is from must implement ${num * 100}"
        }

    })

    println(thisIsMutable)
}

interface SomeInterface {
    fun mustimplement(num: Int): String
}

fun wantSomeInterface(si: SomeInterface) {
    println("Printing from wants some interface ${si.mustimplement(100)}")
}