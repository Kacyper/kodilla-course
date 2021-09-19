package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Maciek", 'M', 1988, 12, 23, 5));
        userList.add(new ForumUser(002, "Sara", 'K', 1994, 1, 12, 33));
        userList.add(new ForumUser(003, "Damian", 'M', 1977, 4, 15, 23));
        userList.add(new ForumUser(004, "Michał", 'M', 1997, 5, 2, 100));
        userList.add(new ForumUser(005, "Lena", 'K', 2000, 1, 20, 0));
        userList.add(new ForumUser(006, "Diana", 'K', 1993, 5, 22, 422));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
