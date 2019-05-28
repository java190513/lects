package com.vcs.lects.l04.operators.tasks;

public class Sultys {


    public boolean arNeraLikucio(
            int sulciuKiekisViso,
            int talposTuris) {
        return sulciuKiekisViso % talposTuris == 0;
    }


    public boolean arNeraLikucio(
            int sulciuKiekisViso,
            int talposTuris,
            boolean reikalingasTikLyginis) {

        boolean arNeraLikucio = sulciuKiekisViso % talposTuris == 0;
        boolean arLyginis = ((double) sulciuKiekisViso / talposTuris) % 2 == 0;

        return arNeraLikucio && (!reikalingasTikLyginis || arLyginis);
    }


}
