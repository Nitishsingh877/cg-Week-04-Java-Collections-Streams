package com.nitish.Junit.basictesting;

import java.util.Locale;
import java.util.SortedMap;

public class TestingStringUtility {
    public static String Reverse(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
    public static boolean isPalindrome(String input){
        StringBuilder sb = new StringBuilder(input);
        if(input.equals(sb.reverse().toString())){
            return true;
        }return false;
    }

    public static String toUpperCase(String input){
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        String input = "aba";

        System.out.println("Reverse is "+Reverse(input));
        System.out.println("IS palindrome : " + isPalindrome(input));
        System.out.println("In upper case : " + toUpperCase(input));
    }
}
