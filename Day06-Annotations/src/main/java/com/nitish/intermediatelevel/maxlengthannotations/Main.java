package com.nitish.intermediatelevel.maxlengthannotations;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a User with a valid username
            User user1 = new User("john_doe");
            System.out.println("User 1 username: " + user1.getUsername());

            // Create a User with an invalid username (length exceeds the limit)
            User user2 = new User("john_doe_long_username");
            System.out.println("User 2 username: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
