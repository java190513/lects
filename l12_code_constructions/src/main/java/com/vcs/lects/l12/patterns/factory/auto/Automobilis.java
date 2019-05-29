package com.vcs.lects.l12.patterns.factory.auto;

public class Automobilis {

    private String vin;


    /**
     * Use AutoFactory instead
     * */
    Automobilis(String generateUniqVIN) {
        vin = generateUniqVIN;
    }

    public String getVin() {
        return vin;
    }


}
