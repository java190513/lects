package com.vcs.lects.l16.spring.auto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jonas extends  Driver {


//    @Autowired
//    private Street street;

    @Autowired
    private CarFActory carFactory;

    public Jonas() {
        super("Jonas");
    }


    @Override
    public Car getCar() {
        return carFactory.takeCarFromRentPoint();
    }


}
