package com.vcs.lects.l12.patterns.builder;

public class CalcUser {

    public static void main(String[] args) {


        // Skaiciuotuvas su ivairiais tipais... kad patogu naudotis butu
        // generics? nope... boolean operacijose?... :) Person aritmetinese operacijose? :D

        Calc calc = new Calc(0);
        calc.prideti(10);
        calc.prideti(true);
        calc.dalinti(3.0);
        calc.atimti(4);
        calc.dauginti(2.0);
        calc.spausdinkResult();
//        calc


        // Builder usage:
        double rez =  new Calc(0).prideti(10).prideti(true).dalinti(3.0).atimti(4).dauginti(2.0).tikRez();



    }


}
