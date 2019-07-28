package com.exercise.aop.impl;

import com.exercise.aop.CarService;
import com.exercise.domain.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 目标对象
 */
@Service
public class CarServiceImpl implements CarService {

    Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    /**
     * 连接点
     * @param car
     */
    @Override
    public void printCar(Car car) {
        logger.info("print car: {}", car);
    }
}
