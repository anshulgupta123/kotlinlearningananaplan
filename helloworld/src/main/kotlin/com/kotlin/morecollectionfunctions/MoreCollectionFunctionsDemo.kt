package com.kotlin.morecollectionfunctions


fun main(args: Array<String>) {
    val setOFInts = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val map = mapOf<String, Car>(
        "John car" to Car("green", "Audi", 2022),
        "Anshul Car" to Car("dark yellow", "Bmw", 2023),
        "Aman Car" to Car("blue", "mercedeze", 2022)
    )
    //println(setOFInts.filter { it%2!=0 })
    //println(setOFInts)
    //println(map.filter { it.value.year==2023 })
    val mutableMap = mutableMapOf<String, Car>(
        "John car" to Car("green", "Audi", 2022),
        "Anshul Car" to Car("dark yellow", "Bmw", 2023),
        "A Car" to Car("blue", "mercedeze", 2019),
        "B Car" to Car("orange", "mercedeze", 2018),
        "C Car" to Car("purple", "mercedeze", 2016)


    )
    //mutableMap.filter { it.value.color=="green" }
   // println(mutableMap.filter({ it.value.modal == "mercedeze" }).map { it.value.color })

    //  println(mutableMap)
    // println(mutableMap.map { it.value.year })

   // println(mutableMap.all { it.value.year>2015 })
  //  println(mutableMap.any { it.value.year>2023 })
  //  println(mutableMap.count ({ it.value.year>2015 }))


    val intArray = arrayOf(1, 2, 3, 4, 5)
    val listAdded10: MutableList<Int> = mutableListOf()
    for (i in intArray) {
        listAdded10.add(i + 10)
    }
    //println(listAdded10)
    //println(intArray.toList().map { it+20 })
    val cars=mutableMap.values
   // println(cars.find { it.year>2015 })
  //  println(cars.groupBy { it.modal })
   // println(mutableMap.toSortedMap())
    println(cars.sortedBy { it.year })
}

data class Car(val color: String, val modal: String, val year: Int) {

}