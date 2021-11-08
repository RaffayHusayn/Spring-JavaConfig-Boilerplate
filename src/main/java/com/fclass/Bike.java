package com.fclass;

import org.springframework.stereotype.Component;

public class Bike implements Vehicle{


    @Override
    public void drive(){
        System.out.println("the bike is driving");
    }
}
