package com.kotlin.javacode;

import java.util.Arrays;

public class DummyClass {


    public String isOnVacation(Boolean onVacation){
        return onVacation?"I am on vacation":"i am working";
    }

    public void printArray(int [] a){
        Arrays.stream(a).forEach(System.out::println);
    }
}
