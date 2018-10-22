package com.exercise.applicationcontext;

import com.exercise.domain.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContextTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Beans.class);
        Car car = configApplicationContext.getBean("car", Car.class);
        System.out.println(car.getBrand());
    }
}
