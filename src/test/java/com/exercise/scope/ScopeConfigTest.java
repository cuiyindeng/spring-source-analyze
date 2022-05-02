package com.exercise.scope;

import com.exercise.applicationcontext.Beans;
import com.exercise.domain.Car;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
        CarService carService = configApplicationContext.getBean("carService", CarService.class);
        CarService carService1 = configApplicationContext.getBean("carService", CarService.class);
        //CarService为@Scope("singleton")时为true，@Scope("prototype")时为false
        System.out.println(carService == carService1);
        //Car为@Scope("singleton")时为true，@Scope("prototype")时为false
        System.out.println(carService.getCar() == carService1.getCar());
        configApplicationContext.destroy();
        configApplicationContext.close();
    }
}
