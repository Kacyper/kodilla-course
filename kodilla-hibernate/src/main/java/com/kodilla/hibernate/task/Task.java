//package com.kodilla.hibernate.task;
//
//import com.sun.istack.NotNull;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.util.Date;
//
//@Entity
//@Table(name = "TASKS")
//public class Task {
//    private int id;
//    private String description;
//    private Date created;
//    private int duration;
//    public Task() {
//    }
//
//    public Task(String description, int duration) {
//        this.description = description;
//        this.created = new Date();
//        this.duration = duration;
//    }
//
//    public int getId() {
//        return id;
//    }
//    @Column(name = "DESCRIPTION")
//    public String getDescription() {
//        return description;
//    }
//    @NotNull
//    @Column(name = "CREATED")
//    public Date getCreated() {
//        return created;
//    }
//    @Column(name = "DURATION")
//    public int getDuration() {
//        return duration;
//    }
//}