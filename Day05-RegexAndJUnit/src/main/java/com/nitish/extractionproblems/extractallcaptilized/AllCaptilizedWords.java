package com.nitish.extractionproblems.extractallcaptilized;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllCaptilizedWords {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-zA-z]*\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York .";
        String[] textArr = text.split("\\s+");

        boolean found = false;

        for (String  t : textArr){
            Matcher matcher = pattern.matcher(t);
            if(matcher.matches()){
                System.out.println("Valid : " + t);
                found = true;
            }
        }
            if(!found){
                System.out.println("Invalid!!");
            }


    }
}
