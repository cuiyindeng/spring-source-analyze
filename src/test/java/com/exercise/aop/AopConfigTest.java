package com.exercise.aop;

import com.exercise.domain.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        CarService carService = configApplicationContext.getBean(CarService.class);
        Car car = configApplicationContext.getBean(Car.class);
        carService.printCar(car);
    }
}
