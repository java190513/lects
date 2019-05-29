package com.vcs.lects.l12.codesplit_01.viaoverride;

public class Main2 {

    public static void main(String[] args) {

        DuomenuIsvedimas2 di = new DuomenuIsvedimas2() {

            @Override
            public void eilutesIsvedimas(String line) {
                System.err.print(line + ", ");
            }

        };


        di.isvesti("Pirma  eilute", "antra eilute");

//        di.isvesti(new IsvedimoBudas(), "Pirma  eilute", "antra eilute");


    }
}
