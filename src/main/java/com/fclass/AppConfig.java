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
        return new Car("toyota", "camry", 2020, engine());
    }
    @Bean
    public Engine engine(){
        return new Engine("boeing", 1000);
    }

}
