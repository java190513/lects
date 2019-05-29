package com.vcs.lects.l12.codesplit_02;

public class Main {
    public static void main(String[] args) {

        DuomenuIsvedimas di = new DuomenuIsvedimas();


        di.isvesti(
                (data, isError) -> System.out.println(isError ? "ERROR" : data),
                logMsg -> {
                },
                (isNotNull, line) -> isNotNull && !line.isEmpty(),
                "Pirma eilute", "", null, "Paskutine eilute");


        di.isvesti(new EilutesIsvedimas() {
                       @Override
                       public void outEilute(String data, boolean isError) {

                           if (isError) {
                               System.out.println("ERROR");
                           } else {
                               System.out.println(data);
                           }

                       }
                   },
                new Loginimas() {
                    @Override
                    public void log(String s) {
                        // leave empty
                    }
                },
                new StringCheck() {
                    @Override
                    public boolean check(boolean isNotNull, String line) {
                        return isNotNull && !line.isEmpty();
                    }
                },
                "Pirma eilute", "", null, "Paskutine eilute");


        EilutesIsvedimas eilIsv = new EilutesIsvedimasImpl();
        Loginimas log = new LoginimasImpl();
        StringCheck check = new StringCheckImpl();
        di.isvesti(eilIsv, log, check, "Pirma eilute", "", null, "Paskutine eilute");


    }

}

class EilutesIsvedimasImpl implements EilutesIsvedimas {

    @Override
    public void outEilute(String data, boolean isError) {

        if (isError) {
            System.out.println("ERROR");
        } else {
            System.out.println(data);
        }

    }
}

class LoginimasImpl implements Loginimas {
    @Override
    public void log(String s) {
        // leave empty
    }
}


class StringCheckImpl implements StringCheck {

    @Override
    public boolean check(boolean isNotNull, String line) {
        return isNotNull && !line.isEmpty();
    }
}