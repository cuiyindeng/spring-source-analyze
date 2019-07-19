package com.exercise.scope;

import com.exercise.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService1 {
    @Autowired
    private Car car;

    public Car getCar() {
        return car;
    }
}
