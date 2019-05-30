package com.vcs.lects.l13.tests.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class LibraryMockitoTest {

    private Library library = null;
    private IBookResource resource = null;



    @Before
    public void init() {
        resource = Mockito.mock(IBookResource.class);
        library = new Library(resource);
    }


    @Test
    public void successLowerCaseTest() {

        Mockito.when(resource.getAllBooks()).thenReturn(new ArrayList<>());
        Mockito.when(resource.getAvailableBooks()).thenReturn(new ArrayList<>());

        library.searchAvailableBooksByName("abc");

        Mockito.verify(resource, Mockito.times(1)).getAvailableBooks();
        Mockito.verify(resource, Mockito.never()).getAllBooks();

    }

}
