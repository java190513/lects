package com.vcs.lects.l09.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {





        Map<String, List<Mokinys>> mokiniai = new HashMap<>();

        mokiniai.put("Jonas", new ArrayList<>());
        mokiniai.get("Jonas").add(new Mokinys("Jonas", 2.6));
        mokiniai.get("Jonas").add(new Mokinys("Jonas", 4.6));
        mokiniai.get("Jonas").add(new Mokinys("Jonas", 5.6));
        mokiniai.get("Jonas").add(new Mokinys("Jonas", 7.6));
        mokiniai.get("Jonas").add(new Mokinys("Jonas", 6.6));
        mokiniai.get("Jonas").add(new Mokinys("Onute", 10));
        mokiniai.get("Jonas").add(new Mokinys("Onute", 7.1));

        mokiniai.put("Antanas", new ArrayList<>());
        mokiniai.get("Antanas").add(new Mokinys("Antanas", 2.9));
        mokiniai.get("Antanas").add(new Mokinys("Antanas", 4.9));
        mokiniai.get("Antanas").add(new Mokinys("Antanas", 5.9));
        mokiniai.get("Antanas").add(new Mokinys("Antanas", 7.9));
        mokiniai.get("Antanas").add(new Mokinys("Antanas", 6.9));
        mokiniai.get("Antanas").add(new Mokinys("Onute", 9.9));


        IReordering impl = new ModernImpl();
        List<List<Mokinys>> result = impl.getReordered(mokiniai);


        for (List<Mokinys> krepselis : result) {

            System.out.println("Krepselis ------------------");

            for (Mokinys mok : krepselis) {
                System.out.println(mok);
            }
            System.out.println();
        }


    }
}
