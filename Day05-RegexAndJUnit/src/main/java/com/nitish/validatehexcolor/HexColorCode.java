package com.nitish.validatehexcolor;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        String regEx = "^#[a-zA-Z]{2}[a-zA-z0-9]{4}$";
        Pattern pattern = Pattern.compile(regEx);

        String input = "#FFA500 #ff4500 #123";
        String[] hexCode = input.split("\\s+");

        boolean found = false;

        for(String code : hexCode){
            Matcher matcher = pattern.matcher(code);
            if(matcher.matches()){
                System.out.println("Valid : " + code);
                found = true;
            }
        }

        if(!found) {
            System.out.println("Invalid");
        }
    }
}
