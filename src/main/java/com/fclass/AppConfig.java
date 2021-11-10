package com.fclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.fclass")
public class AppConfig {

    @Bean
    public Car car(){
        Car car =  new Car("toyota", "camry", 2020);
        car.setEngine(engine());
        return car;
    }
    @Bean
    public Engine engine(){
        return new Engine();
    }

}
