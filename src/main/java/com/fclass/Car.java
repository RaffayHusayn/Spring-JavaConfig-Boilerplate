package com.fclass;

import org.springframework.stereotype.Component;

public class Car implements Vehicle{

    String name;
    String type;
    int year;

    public Car(String n, String t, int y){
        this.name = n;
        this.type = t;
        this.year = y;
        System.out.println("3 argument constructor called");
    }
    @Override
    public void drive(){
        System.out.println("the car is driving");
    }
}
