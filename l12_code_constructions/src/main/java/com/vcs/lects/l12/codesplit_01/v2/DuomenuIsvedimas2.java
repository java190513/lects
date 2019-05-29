package com.vcs.lects.l12.codesplit_01.v2;

public class DuomenuIsvedimas2 {


    public void isvesti(String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {

                eilutesIsvedimas(line);
            }
        }
    }

    public void eilutesIsvedimas(String line) {
        System.out.println(line);
    }
}
