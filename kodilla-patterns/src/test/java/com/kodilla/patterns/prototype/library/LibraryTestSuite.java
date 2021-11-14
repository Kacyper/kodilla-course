package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Library");
        library.getBooks().add(new Book("50 Shades of Grey", "xxx", LocalDate.of(2011, 1, 1)));
        library.getBooks().add(new Book("In Search of Lost Tim", "xxx", LocalDate.of(1913, 1, 1)));
        library.getBooks().add(new Book("Ulysses", "xxx", LocalDate.of(1904, 1, 1)));
        library.getBooks().add(new Book("I Feel Bad About My Neck", "xxx", LocalDate.of(2006, 1, 1)));
        library.getBooks().add(new Book("Harry Potter and the Goblet of Fire", "xxxx", LocalDate.of(2000, 1, 1)));
        library.getBooks().add(new Book("A Little Life", "xxxx", LocalDate.of(2015, 1, 1)));
        library.getBooks().add(new Book("Think and Grow Rich", "xxx", LocalDate.of(1937, 1, 1)));

        assertEquals(7, library.getBooks().size());

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Then
        assert clonedLibrary != null;
        assertEquals(7, clonedLibrary.getBooks().size());
        assert deepClonedLibrary != null;
        assertEquals(7, deepClonedLibrary.getBooks().size());
    }
}

