package com.vcs.lects.l12.patterns.singleton.dbconn;

public class DBConnSingletonFactory {



    private static DBConnection conn = null;


    public static DBConnection createDbConnection() {

        System.out.println("getting connection...");

        if (conn == null) {
            conn = new DBConnection();
        }

        return conn;
    }


}
