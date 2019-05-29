package com.vcs.lects.l12.codesplit_01;

public class DuomenuIsvedimas {

    public void isvesti(String... lines) {

        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                System.out.println(line);
            }
        }

    }
}
