@file:JvmName("StaicCar2")

package com.kotlin.callkotlinfromjava
import java.io.IOException

@Throws(IOException::class)
fun doIo(){
    throw IOException()
}

object SingletonObject{
    @JvmStatic fun doSomeThing()=println("Doing something in the singleton")
}

class Car1(var modal:String,var color:String,var year:Int){



    companion object{
        const val constant=25
       @JvmField val isAuto=false
       @JvmStatic fun carComp()= println("I am in car compoanion object")
    }

    fun printMe(text:String){
        println("I am not expecting null value $text")
    }

   @JvmOverloads fun defauktArgs(str:String,num:Int=25){
       println("Number is $num")
    }

}