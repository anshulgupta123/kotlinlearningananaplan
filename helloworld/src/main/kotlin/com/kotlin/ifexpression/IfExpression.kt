package com.kotlin.ifexpression

fun main(args: Array<String>) {
    val someCondition=54<78
    val num=if(someCondition) 100 else  65
    println(num)

    if(someCondition){
        println("something")
    }
    else{
        println("something else")
    }

    val num2=if(someCondition){
        println("something")
        50
    }
    else{
        println("some thing else")
        52
    }
    println("Num2 is $num2")

    println(if(someCondition){
        10
    }
        else{
            20
    }
    )

    var x=if(someCondition){
        println("something")
    }
    else{
        println("something else")
    }
    println(x.javaClass)
}