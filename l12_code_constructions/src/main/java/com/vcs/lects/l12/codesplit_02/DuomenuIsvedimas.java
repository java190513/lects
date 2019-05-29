package com.vcs.lects.l12.codesplit_02;

public class DuomenuIsvedimas {


    public void isvesti(EilutesIsvedimas eilIsv, Loginimas log, StringCheck strCheck, String... lines) {

        log.log("isvesti() begin");

        for (String line : lines) {
            if ( strCheck.check( line != null , line)) {
                eilIsv.outEilute(line, false);
            } else {
                eilIsv.outEilute("empty line detected", true);
            }
        }

        log.log("isvesti() end");
    }





}
