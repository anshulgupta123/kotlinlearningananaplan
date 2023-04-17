package com.kotlin.whenexpression.javainteroperability

fun main(args: Array<String>) {
    val car = Car("blue", "ford", 2015)
    //car.color="green"
   // car.color=null
  //  println(car)
    var modal:String=car.modal
  //  modal=null
  //  println(modal)
    //car.variableMethod(10,"hello","hii")

    //var array= arrayOf("a","b","c")
    //car.variableMethod(10,*array)
   // var arr= arrayOf(1,2,3,4,5)
    //car.wantsIntArray(arr)
  //  (car.anyObject as java.lang.Object).notify()
    println(Car.x)
    print(Car.getXValue())
    car.demoMethod({ println("I am in athread") })
}
