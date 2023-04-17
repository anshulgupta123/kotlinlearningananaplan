package com.kotlin.whenexpression.javainteroperability;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class Car {

    public static int x = 10;
    private String modal;
    private String color;
    private Integer year;
    private Object anyObject;

    public Car(String modal, String color, Integer year) {
        this.modal = modal;
        this.color = color;
        this.year = year;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public @NotNull String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void variableMethod(int num, String... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public void wantsIntArray(Integer[] arr) {
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    public Object getAnyObject() {
        return anyObject;
    }

    public void setAnyObject(Object anyObject) {
        this.anyObject = anyObject;
    }

    public static int getXValue() {
        return x;
    }

    public void demoMethod(Runnable r) {
        new Thread(r).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am in a thread");
//            }
//        }).start();
//        new Thread(()->System.out.println("I am in a thread")).start();
    }

    @Override
    public String toString() {
        return "Car{" +
                "modal='" + modal + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
