package com.kotlin.readbinaryfiles

import java.io.DataInputStream
import java.io.FileInputStream

fun main(args: Array<String>) {
    val di=DataInputStream(FileInputStream("testfile1.bin"))
     var si:String
     try{
         while (true){
             si=di.readUTF()
             println(si)
         }
     }
     catch(e:Exception){
        e.printStackTrace()
     }
}