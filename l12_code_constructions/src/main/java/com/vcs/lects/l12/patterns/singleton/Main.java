package com.vcs.lects.l12.patterns.singleton;

import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnSingletonFactory;

public class Main {


    public static void main(String[] args) {


        Main m = new Main();
        m.darykLogika();


        DBConnSingletonFactory.createDbConnection();

    }

    private void darykLogika() {

        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();

        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();

        darykKitka();


    }

    private void darykKitka() {
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();


        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
        DBConnSingletonFactory.createDbConnection();
    }

}
