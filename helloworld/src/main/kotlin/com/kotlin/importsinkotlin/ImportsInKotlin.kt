package com.kotlin.importsinkotlin

import com.kotlin.enums.Department
import com.kotlin.singleton.topLevel

fun main(args: Array<String>) {
    //topLevelePrivate()
    println(topLevel("Understanding imports"))
    println(Department.IT.getDeptInfo())
}