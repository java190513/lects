package com.vcs.lects.l12.patterns.factory;

import com.vcs.lects.l12.patterns.factory.auto.AutoFactory;
import com.vcs.lects.l12.patterns.factory.auto.Automobilis;

public class Main {

    public static void main(String[] args) {
        Automobilis a1 = AutoFactory.createInstance(true);
      //  a1.setVin(VINCodesGenerator.generateUniqVIN());

        Automobilis a2 = AutoFactory.createInstance(false);
        Automobilis a3 = AutoFactory.createInstance(false);


        System.out.println();
        System.out.println("Identifikavimo procedura: ");
        System.out.println();
        System.out.println(a1.getVin());
        System.out.println(a2.getVin());
        System.out.println(a3.getVin());

    }

    private void asdasd() {
        AutoFactory.createInstance(true);
    }



}
