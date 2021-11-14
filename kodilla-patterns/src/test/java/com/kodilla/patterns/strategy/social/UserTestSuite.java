package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark M");
        User mike = new YGeneration("Mike Y");
        User sandra = new ZGeneration("Sandra Z");

        //When
        String markM = mark.sharePost();
        System.out.println("Mark uses: " + markM);
        String mikeY = mike.sharePost();
        System.out.println("Mike uses: " + mikeY);
        String sandraZ = sandra.sharePost();
        System.out.println("Sandra uses: " + sandraZ);

        //Then
        assertEquals("Facebook", markM);
        assertEquals("Snapchat", mikeY);
        assertEquals("Twitter", sandraZ);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Mark M");
        millenials.sharePost();

        //When
        String facebook = millenials.sharePost();

        //Then
        assertEquals("Facebook", facebook);
    }
}
