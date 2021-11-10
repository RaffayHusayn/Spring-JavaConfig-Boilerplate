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

}
