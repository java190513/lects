package com.vcs.lects.l05.tasks;

public class PersonConverter {

    private static final int ONE_NAME_LENGHT = 5;

    public static void main(String[] args) {
        PersonConverter pc = new PersonConverter();

        Person aaa = pc.personFromString("Ona Onute 4485465456 1984 mot");

        System.out.println(aaa);

        aaa = pc.personFromString("Ona Onute Oniene 4485465456 1984 mot");

        System.out.println(aaa);

    }

    /**
     * "Ona Onute 4485465456 1984 mot" -> Person
     * <p>
     * "Algis Antanas Žigas 3485465456 1984 vyr"
     */

    public Person personFromString(String strData) {


        String[] splited = strData.split(" ");

        Person pers = new Person();

        int c = 0;

        if (splited.length == ONE_NAME_LENGHT) {
            pers.setVardas(splited[c++] );
        } else {
            pers.setVardas(splited[c++] + " " + splited[c++]);
        }

        pers.setPavarde(splited[c++]);
        pers.setAk(splited[c++]);
        pers.setGimMetai(Integer.parseInt(splited[c++]));
        pers.setLytis(Lytis.valueOf(splited[c++].toUpperCase()));

        return pers;
    }

}


