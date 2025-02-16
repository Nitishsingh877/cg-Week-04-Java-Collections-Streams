package com.nitish.Junit.advancejunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration userRegistration;
    @BeforeEach
    void setup(){
        userRegistration = new UserRegistration();
    }

    @Test
    void addUser() {
            Exception exception = assertThrows(IllegalArgumentException.class,() -> userRegistration.AddUser("","sjnvd@gmail.com","vljsd"));
            assertEquals("can`t be empty.",exception.getMessage(),"not matched");

        }
    }
