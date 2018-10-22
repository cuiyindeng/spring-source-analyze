package com.exercise.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    public Car() {
        System.out.println("调用Car的构造函数");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @PostConstruct
    public void myInit() {
        System.out.println("调用init-method()方法");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("调用destroy-method()方法");
    }
}
