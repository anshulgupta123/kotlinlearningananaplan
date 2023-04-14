package com.kotlin.genericscovariance

fun main(args: Array<String>) {
    val shortList: List<Short> = listOf(10, 20, 30, 40, 50)
    val shortListOfMutable:List<Short> = mutableListOf(10, 20, 30, 40, 50)
    convertToInt(shortList)
    convertToInt2(shortListOfMutable)

}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println(num.toInt())
    }
}

fun convertToInt2(collection: List<Number>) {
    for (num in collection) {
        println(num.toInt())
    }
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

fun tendGarden(rose: Garden<Rose>) {
    waterGarden(rose)
}

class Garden<out T : Flower> {
    val listOfFlowers: List<T> = listOf()
    fun pickFlower(i:Int):T=listOfFlowers[i]
    //fun plantFlower(flower:T){
      //
    //}
}

class Rose : Flower() {

}