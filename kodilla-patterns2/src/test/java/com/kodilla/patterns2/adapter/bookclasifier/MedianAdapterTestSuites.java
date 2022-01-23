package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookA = new HashSet<>();


        bookA.add(new Book("Mike", "Bike", 2020));
        bookA.add(new Book("Like", "Dike", 2010));
        bookA.add(new Book("Keep", "Mic", 2013));
        bookA.add(new Book("Take", "Kite", 2220));
        bookA.add(new Book("Fly", "High", 2420));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        assertEquals (2020, median);
    }

}
