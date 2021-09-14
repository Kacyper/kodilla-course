package com.kodilla.testing.collection;


import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case begins");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case ended");
    }

    @DisplayName("Test sprawdzający pustą listę.")

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList=new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + listNumbers);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }

    @DisplayName("Test sprawdzający Arrays.asList")

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(123,421,44,999,14,125,33,50));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(44,14,50));

        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(list);
        System.out.println("Even " + listNumbers);
        //Then
        Assertions.assertEquals(oddList,listNumbers);
    }
}
