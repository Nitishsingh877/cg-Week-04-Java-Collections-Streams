package com.nitish.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String SSN = "123-45-6789";
        String regex = "\\d{3}+-\\d{2}+-\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(SSN);

        boolean flag = false;

        while (matcher.find()){
            System.out.println("MY SSN is : " + matcher.group());
            flag = true;
        }

        if(!flag){
            System.out.println("Invalid SSN");
        }
    }
}
