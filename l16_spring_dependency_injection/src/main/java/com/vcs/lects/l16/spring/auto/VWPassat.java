package com.vcs.lects.l16.spring.auto;


import org.springframework.stereotype.Component;

@Component
public class VWPassat implements Car {
    @Override
    public void uzvesti() {
        System.out.println("Brum brum... ");
    }
}
