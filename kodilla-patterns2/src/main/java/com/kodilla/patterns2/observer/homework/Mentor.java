package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String name;
    private int updateValue;

    public Mentor (String name) {
        this.name = name;
    }

    public int getUpdateValue() {
        return updateValue;
    }

    @Override
    public void update(Student student) {
        System.out.println("Mentor: " + name);
        System.out.println("Student: " + student.getName() + "\nNumbers of tasks: " + student.getTask().size() + "\n");
        updateValue++;

    }
}
