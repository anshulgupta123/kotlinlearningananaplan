package com.kotlin.mapsanddestructringdeclarations

fun main(args: Array<String>) {

    val immutableMap= mapOf<Int,Car>(1 to Car("green","Audi",2022),2 to Car("dark yellow","Bmw",2023)
    ,3 to Car("blue","mercedeze",2022))
    println(immutableMap.javaClass)
    println(immutableMap)
    val mutableMap= mutableMapOf<String,Car>("John car" to Car("green","Audi",2022),"Anshul Car" to Car("dark yellow","Bmw",2023)
        ,"Aman Car" to Car("blue","mercedeze",2022))
    println(mutableMap.javaClass)
    println(mutableMap)
    val hashMap= hashMapOf<String,Car>("John car" to Car("green","Audi",2022),"Anshul Car" to Car("dark yellow","Bmw",2023)
        ,"Aman Car" to Car("blue","mercedeze",2022))
    println(hashMap.javaClass)
    println(hashMap)
    mutableMap.put("AKash Car", Car("green","Audi A6",2022))
    println(mutableMap)

    val pair=Pair(10,"Coffe")
  //  val firstValue=pair.first
    //val secondValue=pair.second
    val(firstValue,secondValue)=pair
    println(firstValue)
    println(secondValue)

    println("Iterating mutable map")
    for(entry in mutableMap){
        println(entry.key)
        println(entry.value)
    }
    //destructuring declaartion
    println("Iterating mutable map- by using destructuring")
    for((key,value) in mutableMap){
        println(key)
        println(value)
    }
    val anshulCar=Car("dark yellow", "Bmw", year=2023)

    val (color,modal,year)= anshulCar
    println(color)
    println(modal)
    println(year)

    val anshulCar2=Car1("dark green", "Bmw", year=2024)

    val (color1,modal1,year1)= anshulCar2
    println(color1)
    println(modal1)
    println(year1)

}
 class Car(val color:String,val modal:String,val year:Int){
    operator  fun component1()=color
     operator  fun component2()=modal
     operator  fun component3()=year


 }
data class Car1(val color:String,val modal:String,val year:Int){

}