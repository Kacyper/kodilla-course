package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumRunner {

    public static void main(String[] args) {

        Forum detailedForum = new Forum();

        Map<Integer, ForumUser> detailsOfForum = detailedForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("Mapped number of users: " + detailsOfForum.size());

        detailsOfForum.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ":" + integerForumUserEntry.getValue())
                .forEach(System.out::println);

    }
}
