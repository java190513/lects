package com.vcs.lects.l16.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Driver {


    private Car car;
    private String name;


    public Driver() {
        this.name = "Unknown";
    }

    public Driver(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
