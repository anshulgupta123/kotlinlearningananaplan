package com.kotlin.reifiedparameters

import java.math.BigDecimal

fun main(args: Array<String>) {
    val mixedList= listOf<Any>("str1",10,10.88,10.90f,BigDecimal(10.99),BigDecimal(15.99),true,false,'v')
    val bigDecimalsOnly= getElementsOfTypes<String>(mixedList)
    println(bigDecimalsOnly)
}

inline fun <reified T> getElementsOfTypes(collection:List<Any>) :List<T>{

    val newList:MutableList<T> = mutableListOf()
    for(element in collection){
        if(element is T){
            newList.add(element)
        }
    }
    return newList
}