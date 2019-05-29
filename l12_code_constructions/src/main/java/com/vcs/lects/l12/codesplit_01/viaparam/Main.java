package com.vcs.lects.l12.codesplit_01.viaparam;

public class Main {

    public static void main(String[] args) {

        DuomenuIsvedimas di = new DuomenuIsvedimas();


        di.isvesti("Pirma  eilute", "antra eilute");

        di.isvesti(new IsvedimoBudas() {

            @Override
            public void eilutesIsvedimas(String line) {
                    System.err.print(line + ", ");
            }
        }, "Pirma  eilute", "antra eilute");


    }


}

