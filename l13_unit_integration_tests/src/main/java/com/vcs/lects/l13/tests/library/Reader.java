package com.vcs.lects.l13.tests.library;

import java.util.List;

public class Reader {

    public static void main(String[] args) {

        Library l = new Library();


        List<Book> searchResult = l.searchAvailableBooksByName( args.length > 0 ? args[0] : null);

        for (Book book: searchResult) {
            System.out.println(book);
        }


    }
}
