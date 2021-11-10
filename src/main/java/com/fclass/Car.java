package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Car implements Vehicle{

    @Value("${car.Name}")
    String name;
    @Value("${car.Type}")
    String type;
    @Value("${car.Year}")
    int year;
    Engine engine;
    public void setEngine(Engine e){

        this.engine = e;
        System.out.println("ENGINE SETTER CALLED");
    }
    public Car(String n, String t, int y ){
        this.name = n;
        this.type = t;
        this.year = y;
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
