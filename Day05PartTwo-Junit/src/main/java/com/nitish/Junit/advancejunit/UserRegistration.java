package com.nitish.Junit.advancejunit;

public class UserRegistration {
    public void AddUser(String username, String email, String password) {
        if(username == null || email == null || password == null){
            throw new IllegalArgumentException("can`t be empty.");
        }
        System.out.println("added successfully");
    }
}
