package com.nitish.Junit.advancejunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
    String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[a-z])(?=.*[@#$%*&])[A-Za-z0-9@#$%&*]{8,}$";

    public boolean isValid(String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
