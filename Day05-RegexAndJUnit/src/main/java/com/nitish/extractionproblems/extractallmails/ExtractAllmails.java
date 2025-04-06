package com.nitish.extractionproblems.extractallmails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllmails {
    public static void main(String[] args) {
        String regEx = "[a-zA-z0-9_.+-]+@[a-zA-z0-9]+\\.[a-zA-z]{2,6}";
        Pattern pattern = Pattern.compile(regEx);

        String text = "Contact us at support@example.com and info@company.org";

       boolean found = false;
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                System.out.println("Valid email : " + matcher.group());
                found = true;
            }
        if(!found){
            System.out.println("Invalid!!");
        }
    }
}
