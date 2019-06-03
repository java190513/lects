package com.vcs.lects.l05.tasks;

public class PersonConverter {

    public static void main(String[] args) {
        PersonConverter pc = new PersonConverter();

        Person aaa = pc.personFromString("Ona Onute 4485465456 1984 mot");

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

        pers.setVardas(splited[0]);
        pers.setPavarde(splited[1]);
        pers.setAk(splited[2]);
        pers.setGimMetai(Integer.parseInt(splited[3]));
        pers.setLytis(Lytis.valueOf( splited[4].toUpperCase() ));


        return pers;
    }

}


