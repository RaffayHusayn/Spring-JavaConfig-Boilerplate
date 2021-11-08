package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car implements Vehicle{

    String name;
    String type;
    int year;
    Engine engine;
    @Autowired
    public Car(String n, String t, int y , Engine e){
        this.name = n;
        this.type = t;
        this.year = y;
        this.engine = e;
        System.out.println("3 argument constructor called");
    }
    @Override
    public void drive(){
        System.out.println("the car is driving");
    }
    public String toString(){
        return "To String Method: name : " + name + " type: "+ type + " year : "+ year+ " engine: "+ engine.company;
    }
}
