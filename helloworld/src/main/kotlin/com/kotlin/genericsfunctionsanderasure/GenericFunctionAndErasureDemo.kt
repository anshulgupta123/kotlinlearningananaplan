package com.kotlin.genericsfunctionsanderasure

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val ints= listOf<Int>(1,2,3,4,5)
    val shorts:List<Short?> = listOf(10,20,30,40)
   // convertToInt(ints)
    //convertToInt(shorts)
    val floats:List<Float> = listOf(100.20f,-200.56f)
    //convertToInt(floats)
    val strings= listOf<String>("1","2","3","4")
    //convertToInt(strings)
   // append(StringBuilder("append1"), StringBuilder("append2"))
   // collectionPrint1(shorts)
    collectionPrint1(ints)
    if(strings is List<String>){
        println("List of string")
    }
    val listOfAny:Any= listOf("str1","str2")
    if(listOfAny is List<*>){
        println("Yes this is a list.ThnakYou")
    }
    if(listOfAny is List<*>){
        println("Yes this is a list.ThnakYou")
        var strList=listOfAny as List<String>
       println(strList[1].replace("str","string"))
    }
}

fun <T : Number> convertToInt(collection:List<T>){
    for(num in collection){
        println(num.toInt())
    }
}

fun<T> append(item1:T,item2:T) where T:CharSequence,T:Appendable{
    println(item1.append(item2))
}

fun<T> collectionPrint(collection:List<T>)
{
    for(num in collection){
        println(num)
    }
}

fun<T:Any> collectionPrint1(collection:List<T>)
{
    for(num in collection){
        println(num)
    }
}