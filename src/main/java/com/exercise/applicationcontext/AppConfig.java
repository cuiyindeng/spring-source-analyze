package com.exercise.applicationcontext;

import com.exercise.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //基于java类配置
    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    public Car car() {
        Car car = new Car();
        car.setMaxSpeed(201);
        return car;
    }

    @Bean
    public MyInstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor() {
        return new MyInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
