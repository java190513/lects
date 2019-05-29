package com.vcs.lects.l12.patterns.factory;

import java.util.UUID;

public class VINCodesGenerator {

    public static String generateUniqVIN() {
        return UUID.randomUUID().toString();
    }


}
