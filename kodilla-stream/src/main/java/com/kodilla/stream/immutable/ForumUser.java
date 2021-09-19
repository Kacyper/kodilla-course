package com.kodilla.stream.immutable;

public final class ForumUser {

    private String userName;
    private String realName;

    public ForumUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public ForumUser(int i, String maciek, char m, int i1, int i2, int i3, int i4) {
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}