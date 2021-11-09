package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = applicationContext.getBean(Board.class);

        board.getDoneList().addTask("Pack camera!");
        board.getInProgressList().addTask("Packing drone.");
        board.getDoneList().addTask("Camera bag is packed");

        //When
        Optional<String> toDoTask = board.getToDoList().getTasks().stream().findAny();
        Optional<String> inProgressTask = board.getInProgressList().getTasks().stream().findAny();
        Optional<String> doneTask = board.getDoneList().getTasks().stream().findAny();

        //Then
        assertTrue(toDoTask.isPresent());
        assertTrue(inProgressTask.isPresent());
        assertTrue(doneTask.isPresent());




    }
}
