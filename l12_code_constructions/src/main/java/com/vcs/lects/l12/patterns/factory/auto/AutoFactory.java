package com.vcs.lects.l12.patterns.factory.auto;

import com.vcs.lects.l12.patterns.factory.VINCodesGenerator;

public class AutoFactory {


    private static Automobilis onlyOne = new Automobilis("BT-" + VINCodesGenerator.generateUniqVIN());

    public static Automobilis createInstance(boolean vw) {

        System.out.println("Sukurem dar viena auto...");
        if (vw) {
            return new Automobilis("VW-" + VINCodesGenerator.generateUniqVIN());
        } else {
            return onlyOne;
        }

    }


}
