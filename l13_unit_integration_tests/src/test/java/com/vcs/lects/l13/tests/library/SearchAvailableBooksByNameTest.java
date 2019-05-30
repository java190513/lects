package com.vcs.lects.l13.tests.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchAvailableBooksByNameTest {


    private Library library = new Library();

    private List<Book> books = null;
    private List<Book> booksAvailable = null;


    @Before
    public void init() {

//        books = new ArrayList<>();
//        books.add(new Book("0", "JAVA", true));
//        books.add(new Book("1", "j a v a", true));
//        books.add(new Book("2", "Java kava", false));
//        books.add(new Book("3", "JaVa", true));
//        books.add(new Book("4", "bilekas java   kazkas   ", true));
//        books.add(new Book("5", "kava su java", true));

        booksAvailable = new ArrayList<>();
        booksAvailable.add(new Book("0", "JAVA", true));
        booksAvailable.add(new Book("1", "j a v a", true));
//        booksAvailable.add(new Book("2", "Java kava", false));
        booksAvailable.add(new Book("3", "JaVa", true));
        booksAvailable.add(new Book("4", "bilekas java   kazkas   ", true));
        booksAvailable.add(new Book("5", "kava su java", true));


        library = new Library(new IBookResource() {
            @Override
            public List<Book> getAllBooks() {
                return booksAvailable;
            }

            @Override
            public List<Book> getAvailableBooks() {
                return booksAvailable;
            }
        });

    }


    @Test
    public void successLowerCaseTest() {

        List<Book> availableBooks = library.searchAvailableBooksByName("java");
        Assert.assertEquals(4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());

    }

    @Test
    public void successUpperCaseTest() {

        List<Book> availableBooks = library.searchAvailableBooksByName("JAVA");
        Assert.assertEquals(4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }

    @Test
    public void successMixedCaseTest() {

        List<Book> availableBooks = library.searchAvailableBooksByName("jaVA");
        Assert.assertEquals(4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }


//    @Test
//    public void failTest() {
//        List<Book> availableBooks = library.searchAvailableBooksByName("js");
//        Assert.assertEquals(0, availableBooks.size());
//    }
//
//    @Test
//    public void emptyTest() {
//        List<Book> availableBooks = library.searchAvailableBooksByName("");
//        Assert.assertEquals(0, availableBooks.size());
//    }


    @Test(expected =  NullPointerException.class)
    public void nullTest() {
        library.searchAvailableBooksByName(null);
        Assert.fail();
    }


}
