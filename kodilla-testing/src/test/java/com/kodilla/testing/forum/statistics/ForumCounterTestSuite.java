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

    private Statistics statisticsMock;
    private ForumCounter forumCounter;

    @BeforeEach
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);
        List<String> mockList = new ArrayList<>();
        for (int i=0; i<20; i++){
            mockList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(mockList);
        when(statisticsMock.postsCount()).thenReturn(30);
        when(statisticsMock.commentsCount()).thenReturn(50);
        forumCounter = new ForumCounter();

        System.out.println("Beginning of testing");
        System.out.println();
    }

    @AfterEach
    public void afterTest() {
        System.out.println("\n" +"Test has ended.");
    }
    @DisplayName("Posts number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getPostsCounts());
        assertEquals(0, forumCounter.getAvgUsersPerPosts());
        assertEquals(0, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("Posts number equals 1000.")
    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumCounter.getPostsCounts());
        assertEquals(50, forumCounter.getAvgUsersPerPosts());
        assertEquals(0.05, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getCommentsCount());
        assertEquals(0, forumCounter.getAvgCommentsPerUser());
        assertEquals(0.0, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number lower than posts number.")
    @Test
    public void testCalculateAdvStatisticsCommentsLowerPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(5);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(4, forumCounter.getCommentsCount());
        assertEquals(5, forumCounter.getPostsCounts());
        assertEquals(0.25, forumCounter.getAvgUsersPerPosts());
        assertEquals(0.2, forumCounter.getAvgCommentsPerUser());
        assertEquals(0.8, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("Comments number higher than posts number.")
    @Test
    public void testCalculateAdvStatisticsCommentsHigherPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(7);
        when(statisticsMock.postsCount()).thenReturn(5);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(forumCounter.getCommentsCount() > forumCounter.getPostsCounts());
        assertEquals(0.25, forumCounter.getAvgUsersPerPosts());
        assertEquals(0.35, forumCounter.getAvgCommentsPerUser());
        assertEquals(1.4, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("User number equals 0.")
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        List<String> mockList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(mockList);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumCounter.getUsersNumber());
        assertEquals(0, forumCounter.getAvgUsersPerPosts());
        assertEquals(0, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

    @DisplayName("User number equals 100.")
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        List<String> mockList = Arrays.asList(new String[100]);
        when(statisticsMock.usersNames()).thenReturn(mockList);
        //When
        forumCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumCounter.getUsersNumber());
        assertEquals(0.3, forumCounter.getAvgUsersPerPosts());
        assertEquals(1.6666666666666667, forumCounter.getAvgCommentsPerPost());
        forumCounter.showStatistics();
    }

}
