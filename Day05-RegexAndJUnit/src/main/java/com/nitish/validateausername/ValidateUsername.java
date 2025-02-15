package com.nitish.validateausername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-z][a-zA-z0-9_]{5,15}$";

        Pattern pattern = Pattern.compile(regex);

        String input = "user_123 user_123 123User user_only";
        String[] usernames = input.split("\\s+");



        boolean foundMatch = false;

        for (String username : usernames){
            Matcher matcher = pattern.matcher(username);
            if(matcher.matches()){
            System.out.println("Valid : " + matcher.group());
            foundMatch = true;
        }}

        if(!foundMatch){
            System.out.println("Invalid");
        }

    }
}
