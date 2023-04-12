package com.kotlin.`interface`

fun main(args: Array<String>) {

}

interface MyInterface {
    val x: Int
        get()=50
    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(str: String): String
}

class Something : MySubInterface {
    override val x: Int
        get() = TODO("Not yet implemented")

    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}