package com.exercise.aop;

import com.exercise.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public Car buildCar() {
        Car car = new Car();
        car.setMaxSpeed(1);
        car.setBrand("xxx");
        car.setColor("asa");
        return car;
    }

    @Bean
    public MyAspect buildMyAspect() {
        return new MyAspect();
    }
}
