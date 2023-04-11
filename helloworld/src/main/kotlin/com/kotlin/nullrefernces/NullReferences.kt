package com.kotlin.nullrefernces

fun main(args:Array<String>){
    //var name:String=null

    var name:String?=null
    var firstName:String?="Anshul"
    if(firstName!=null) {
        println(firstName.toUpperCase())
    }

    println("what happen when we do this ${name?.uppercase()}")
    println("converting first name to upper case ${firstName?.uppercase()}")

    var dog :String ?=null
    var dog2=dog?:"This is default name"
    println(dog2)


    var arr: Any= arrayOf(1,2,3,4)
    var stringarr=arr as? String
    println(stringarr)

    val fruit:String?="mango"
    println(fruit!!.uppercase())

    val hello :String ?="hii"
    println(hello!!.uppercase())


    val callingText:String?="hello"
    printText(callingText!!)
    callingText?.let {  printText(it) }

}

fun printText(text:String){
println(text)
}