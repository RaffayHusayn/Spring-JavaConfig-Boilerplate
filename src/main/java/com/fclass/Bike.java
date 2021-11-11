package com.fclass;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Component
public class Bike implements Vehicle{
    String name;
    public Bike(String name){
        System.out.println("bike constructor called named : "+ name);
    }

    @Override
    public void drive(){
        System.out.println("the bike is driving");
    }
}
