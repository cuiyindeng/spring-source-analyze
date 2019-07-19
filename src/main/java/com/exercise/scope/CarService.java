package com.exercise.scope;

import com.exercise.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarService {
    @Autowired
    private Car car;

    public Car getCar() {
        return car;
    }
}
