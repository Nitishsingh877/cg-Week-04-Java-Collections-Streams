package com.nitish.intermediatelevel.maxlengthannotations;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10) // Maximum length of 10 characters
    private String username;

    // Constructor to validate the username length
    public User(String username) {
        validateUsernameLength(username);
        this.username = username;
    }

    // Method to validate the username length using Reflection
    private void validateUsernameLength(String username) {
        try {
            // Get the Class object for User
            Class<?> userClass = this.getClass();

            // Get the username field
            Field usernameField = userClass.getDeclaredField("username");

            // Check if the @MaxLength annotation is present on the field
            if (usernameField.isAnnotationPresent(MaxLength.class)) {
                // Retrieve the @MaxLength annotation
                MaxLength maxLength = usernameField.getAnnotation(MaxLength.class);

                // Validate the length of the username
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username length exceeds the maximum allowed length of " + maxLength.value());
                }
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}
