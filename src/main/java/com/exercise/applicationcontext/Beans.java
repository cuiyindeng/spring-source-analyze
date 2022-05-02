package com.exercise.applicationcontext;

import com.exercise.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Beans {

    @Bean(name = "car")
    @Lazy
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("QQ");
        return car;
    }
}
