package com.kotlin.practice

fun main(args: Array<String>) {

    engineRun(Engine<Bike>())
    engineRun(Engine<SmallBike>())
    var a = A10()
    a.happy()

}

open class MotorBike {

}

open class Bike : MotorBike() {

}

class SmallBike : Bike() {

}

class Engine<out T> {

}

fun engineRun(engine: Engine<Bike>) {

}

interface Happy {
    fun happy() {
        println("Happy")
    }
}

interface Happy2 {
    fun happy() {
        println("Very happy")
    }
}

interface Happy3 {
    fun happy() {
        println("Very happy happy")
    }
}

class A10 : Happy, Happy2, Happy3 {
    override fun happy() {
        super<Happy3>.happy()
    }
}