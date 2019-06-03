package com.vcs.lects.l16.spring.auto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Martynas extends Driver {

    @Autowired
    private Trabant car;


    public Martynas() {
        super("Martynas");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
