package com.kotlin.companionobject

fun main(args: Array<String>) {
  //  SomeClass.SomeCompanion.accessPrivateVariable()
    println(SomeClass.justAssign("hello").str)
    println(SomeClass.upperOrLowerCase("hello",false).str)

}

class SomeClass private constructor(val str:String) {


    companion object SomeCompanion {
        private var privateVariable: Int = 10
        fun accessPrivateVariable() {
            println("We are accesing private variable $privateVariable")
        }
        fun justAssign(str:String)=SomeClass(str)
        fun upperOrLowerCase(str:String,lowercase:Boolean):SomeClass{
            if(lowercase){
                     return SomeClass(str.toLowerCase())
            }
            else{
                return SomeClass(str.uppercase())
            }
        }
    }
}