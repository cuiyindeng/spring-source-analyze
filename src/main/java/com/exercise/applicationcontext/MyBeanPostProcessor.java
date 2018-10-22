package com.exercise.applicationcontext;

import com.exercise.domain.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("=====:BeanPostProcessor call postProcessBeforeInitialization，color为空，默认设置为黑色");
                car.setColor("黑色");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getMaxSpeed() > 200) {
                System.out.println("=====:BeanPostProcessor call postProcessAfterInitialization，将maxSpeed调整为200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
