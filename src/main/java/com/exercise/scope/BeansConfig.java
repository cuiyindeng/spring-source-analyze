package com.exercise.scope;

import com.exercise.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan
public class BeansConfig {
    @Bean
//    @Scope("singleton")
    @Scope("prototype")
    public Car buildCar() {
        Car car = new Car();
        return car;
    }
}
