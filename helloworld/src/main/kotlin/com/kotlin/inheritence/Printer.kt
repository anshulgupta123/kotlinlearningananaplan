package com.kotlin.inheritence


fun main(args: Array<String>) {
    val laserprinter = LaserPrinter("Brother Printer", 15)
    //laserprinter.printModel()
    //println(laserprinter.bestSellingprice())
    val specialLaserprinter = SpecialLaser("Special Laser Printer", 20)
    //specialLaserprinter.printModel()
    //println(specialLaserprinter.bestSellingprice())
    val something = SomethingElse("Hello");
}

abstract class Printer(val modalName: String) {
    open fun printModel() = println("The modal name for this printer is $modalName")
    abstract fun bestSellingprice(): Double
}

open class LaserPrinter(modalName: String, ppm: Int) : Printer(modalName) {

    final override fun printModel() = println("The modal name for this laser printer is $modalName")
    override fun bestSellingprice(): Double = 129.90

}

class SpecialLaser(modalName: String, ppm: Int) : LaserPrinter(modalName, ppm) {

}

open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("i ma a parent constructor")
    }
}


class SomethingElse : Something {
    constructor(someProperty: String) : super(someProperty){
      println("I am a child constructor")
    }
}

//open data class DataClass(val number:Int){

//}