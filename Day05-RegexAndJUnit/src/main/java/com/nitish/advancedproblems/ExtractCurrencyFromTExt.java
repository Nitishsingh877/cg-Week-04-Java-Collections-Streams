package com.nitish.advancedproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyFromTExt {
    public static List<String> extractCurrency(String  sentence){
        List<String> value = new ArrayList<>();
        String  regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()){
            value.add(matcher.group());
        } return value;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> result = extractCurrency(text);
        System.out.println(result);
    }
}
