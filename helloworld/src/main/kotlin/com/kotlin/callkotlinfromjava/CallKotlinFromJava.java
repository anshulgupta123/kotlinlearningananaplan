package com.kotlin.callkotlinfromjava;

import java.io.IOException;

public class CallKotlinFromJava {
    public static void main(String[] args) {
//        StaicCar.topLevel();
//        Car1.Companion.carComp();
//        Car1.carComp();
//        SingletonObject instance = SingletonObject.INSTANCE;
//        instance.doSomeThing();
//        SingletonObject.doSomeThing();
//        // System.out.println(Car1.Companion.isAuto());
//        System.out.println(Car1.isAuto);
//        System.out.println(Car1.constant);
        Car1 car1 = new Car1("audi", "`blue", 2023);
//        car1.printMe(null);
//        try {
//            StaicCar2.doIo();
//        }
//        catch (IOException e){
//            System.out.println("IoException occured");
//            e.printStackTrace();
//        }

        car1.defauktArgs("the default number is");
    }


}
