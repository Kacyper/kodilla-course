package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumCounterTestSuite {

    @BeforeEach
    public void beforeTest() {
        System.out.println("Beginning of testing");
        System.out.println();
    }

    @AfterEach
    public void afterTest() {
        System.out.println("\n" +"Test ended.");
    }
    @DisplayName("Posts number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getPostsCounts());
        forumCounter.showStatistics();
    }

    @DisplayName("Posts number equals 1000.")
    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumCounter.getPostsCounts());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getCommentsCount());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number lower than posts number.")
    @Test
    public void testCalculateAdvStatisticsCommentsLowerPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(5);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(forumCounter.getCommentsCount() < forumCounter.getPostsCounts());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number higher than posts number.")
    @Test
    public void testCalculateAdvStatisticsCommentsHigherPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(7);
        when(statisticsMock.postsCount()).thenReturn(5);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(forumCounter.getCommentsCount() > forumCounter.getPostsCounts());
        forumCounter.showStatistics();
    }

    @DisplayName("User number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        List<String> list = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(list);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getUsersNumber());
        forumCounter.showStatistics();
    }

    @DisplayName("User number equals 100.")
    @Test
    public void testCalculateAdvStatistics1000Users() {
        //Given
        List<String> list = Arrays.asList(new String[100]);
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(list);
        ForumCounter forumCounter = new ForumCounter();
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumCounter.getUsersNumber());
        forumCounter.showStatistics();
    }

}
