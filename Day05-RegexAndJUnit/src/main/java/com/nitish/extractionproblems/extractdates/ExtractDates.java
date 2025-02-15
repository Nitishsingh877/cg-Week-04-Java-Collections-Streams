package com.nitish.extractionproblems.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        String date = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        Matcher matcher = pattern.matcher(date);
        Boolean found = false;

        while (matcher.find()){
            System.out.println("Dates are :" + matcher.group());
            found = true;
        }

        if(!found){
            System.out.println("Invalid");
        }
    }
}
