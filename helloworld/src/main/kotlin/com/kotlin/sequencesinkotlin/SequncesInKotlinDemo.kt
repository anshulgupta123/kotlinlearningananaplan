package com.kotlin.sequencesinkotlin

import com.kotlin.morecollectionfunctions.Car

fun main(args: Array<String>) {
    val map = mapOf<String, Car>(
        "John car" to Car("green", "Audi", 2022),
        "Anshul Car" to Car("dark yellow", "Bmw", 2023),
        "A Car" to Car("blue", "mercedeze", 2019),
        "B Car" to Car("orange", "mercedeze", 2018),
        "C Car" to Car("purple", "mercedeze", 2016)
    )
   // println(map.asSequence().filter { it.value.modal == "mercedeze" }.map { it.value.color })
    listOf<String>("Joe", "Mary", "Jane").asSequence().filter { println("Filtering $it");it[0] == 'J' }
        .map { println("Mapping to uppers case $it");it.uppercase() }.toList()

    listOf<String>("Joe", "Mary", "Jane").asSequence().filter { println("Filtering $it");it[0] == 'J' }
        .map { println("Mapping to uppers case $it");it.uppercase() }.find { it.endsWith('E') }
}

data class Car(val color: String, val modal: String, val year: Int) {

}