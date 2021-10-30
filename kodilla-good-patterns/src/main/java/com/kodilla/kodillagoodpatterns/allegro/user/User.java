package com.kodilla.kodillagoodpatterns.allegro.user;

public class User {
    private final String firstName;
    private final String lastName;
    private final String nickName;

    public User(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }
}
