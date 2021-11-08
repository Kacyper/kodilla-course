package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {

    @Override
    public String userName() {
        return "John Smith";
    }
}
