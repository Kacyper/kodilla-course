package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        Student student3 = new Student("Student 3");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor1);

        //When
        student1.addTask("Task 1");
        student1.addTask("Task 3");
        student2.addTask("Task 2");
        student2.addTask("Task 4");
        student2.addTask("Task 6");
        student3.addTask("Task 5");
        student3.addTask("Task 7");
        student1.addTask("Task 8");

        //Then
        assertEquals (5, mentor1.getUpdateValue());
        assertEquals (3, mentor2.getUpdateValue());

    }
}
