package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Street {


    @Autowired
    private Jonas drv1;

    @Autowired
    private Martynas drv2;

//    @Autowired
//    private Driver drv3;


    @PostConstruct
    public void morning() {


        System.out.println("Rytas...");
        System.out.println(drv1.getName() + " susitinka " + drv2.getName());
        System.out.println("Eina link auto...");

        driverRunningItsOwnCar(drv1);

        driverRunningItsOwnCar(drv2);

//        driverRunningItsOwnCar(drv3);



    }

    private void driverRunningItsOwnCar(Driver drv) {
        System.out.print( drv.getName() + " uzvedineja savo " + drv.getCar().getClass().getSimpleName() + " VIN: " + drv.getCar().hashCode() + " ");
        drv.getCar().uzvesti();
    }


}
