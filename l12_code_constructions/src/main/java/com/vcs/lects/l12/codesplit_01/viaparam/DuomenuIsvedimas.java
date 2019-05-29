package com.vcs.lects.l12.codesplit_01.viaparam;

public class DuomenuIsvedimas {

    public void isvesti(String... lines) {
        isvesti(new IsvedimoBudas(){

            @Override
            public void eilutesIsvedimas(String line) {
                System.out.println(line);
            }
        }, lines);
    }

    public void isvesti(IsvedimoBudas eilIsv, String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {

                // System.out.println(line);
                eilIsv.eilutesIsvedimas(line);
            }
        }
    }
}
