package com.fclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args){

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Car mehran = factory.getBean("car", Car.class);
        mehran.drive();
        System.out.println(mehran.toString());
        System.out.println(";;;;;;;;;;;;;;;");
        Bike honda = factory.getBean("bike", Bike.class);

    }
}
