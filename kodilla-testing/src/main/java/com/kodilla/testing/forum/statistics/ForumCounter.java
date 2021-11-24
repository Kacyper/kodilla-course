package com.kodilla.testing.forum.statistics;

public class ForumCounter {

    private int usersNumber;
    private int postsCounts;
    private int commentsCount;
    private double avgUsersPerPosts;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics (Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsCounts = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (statistics.postsCount() == 0 || statistics.usersNames().size() == 0) {
            avgUsersPerPosts = 0.0;
        } else {
            avgUsersPerPosts = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        if (statistics.commentsCount() == 0 || statistics.usersNames().size() == 0) {
            avgCommentsPerUser = 0.0;
        } else {
            avgCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.commentsCount() == 0 || statistics.usersNames().size() == 0) {
            avgCommentsPerPost = 0.0;
        } else {
            avgCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }

    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsCounts() {
        return postsCounts;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgUsersPerPosts() {
        return avgUsersPerPosts;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

public void showStatistics() {
    System.out.println("Showing statistics of this forum.");
    System.out.println();
    System.out.println("At the moment we have " + usersNumber + " users.");
    System.out.println("Users have written " + postsCounts + " comments so far.");
    System.out.println("They have also written " + commentsCount + " so far.");
    System.out.println();
    System.out.println("User usually writes " + avgUsersPerPosts + " posts.");
    System.out.println("Average user has written " + avgCommentsPerUser + " comments.");
    System.out.println("Each post has been commented " + avgCommentsPerPost + " times on average.");
}

}
