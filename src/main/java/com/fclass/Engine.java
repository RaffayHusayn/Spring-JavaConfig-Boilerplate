package com.fclass;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
    @Value("Some comnay")
    String company;
    @Value("10000000")
    int horsePower;

//    public Engine(String c, int hp){
//        this.company = c;
//        this.horsePower = hp;
//    }
}
