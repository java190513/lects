package com.vcs.lects.l13.tests.library;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class LibraryIT {

//    @Ignore
    @Test
    public void search() {

        Library library = new Library();
        List<Book> availableBooks = library.searchAvailableBooksByName("9832798327984273984329843298983274983247");

        Assert.assertEquals(0, availableBooks.size());
    }

}
