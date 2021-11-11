package com.fclass;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fclass")
@PropertySource("car-info.properties")
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
    @Bean
    @Scope("prototype") //constructor is not called when IoC is made, but when the Bean is called
    public Bike bike(){
        return new Bike("honda");
    }
}
