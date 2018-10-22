package com.exercise.applicationcontext;

import com.exercise.domain.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Car bean = applicationContext.getBean(Car.class);
        System.out.println(bean.getColor());
        applicationContext.destroy();
    }
}
