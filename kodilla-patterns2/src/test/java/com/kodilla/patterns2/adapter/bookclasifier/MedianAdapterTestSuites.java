package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuites {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();


        bookA.add(new Book("Mike Bike", "Bike", 2020, "4es"));
        bookA.add(new Book("Like That", "Dike", 2010, "8ty"));
        bookA.add(new Book("Keep On", "Mic", 2013, "7y"));
        bookA.add(new Book("Take Me", "Kite", 2220, "kl"));
        bookA.add(new Book("Fly In", "High", 2420, "ok"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        assertEquals (2020, median);
    }

}
