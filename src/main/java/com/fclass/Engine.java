package com.fclass;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
    @Value("${engine.Company}")
    String company;
    @Value("${engine.Horsepower}")
    int horsePower;

//    public Engine(String c, int hp){
//        this.company = c;
//        this.horsePower = hp;
//    }
}
