package com.vcs.lects.l12.codesplit_02;

public class DuomenuIsvedimas {


    public void isvesti(String... lines) {

        System.out.println("isvesti() begin");

        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                System.out.println(line);
            } else {
                System.out.println("empty line detected");
            }
        }

        System.out.println("isvesti() end");
    }


    public void isvestiNotNull(String... lines) {

        System.out.println("isvesti() begin");

        for (String line : lines) {
            if (line != null) {
                System.out.println(line);
            } else {
                System.out.println("empty line detected");
            }
        }

        System.out.println("isvesti() end");
    }


}
