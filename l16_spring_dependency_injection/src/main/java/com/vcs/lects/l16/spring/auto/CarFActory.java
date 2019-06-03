package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarFActory {


    @Autowired
    private VWPassat passat;

    @Autowired
    private Trabant trabant;

    @Value("${vip:false}")
    private Boolean vipCar;

    public Car takeCarFromRentPoint() {

        if (vipCar) {
            return trabant;
        }
        return passat;
    }


}
