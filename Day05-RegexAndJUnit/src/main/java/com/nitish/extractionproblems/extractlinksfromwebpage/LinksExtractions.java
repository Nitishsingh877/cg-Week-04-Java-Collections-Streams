package com.nitish.extractionproblems.extractlinksfromwebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinksExtractions {

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "[a-z]{4,}+://[a-zA-z]+\\.*[a-z]+\\.[a-z]{3}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()){
            System.out.println("Links are : " + matcher.group());
            found = true;
        }

        if(!found){
            System.out.println("Invalid.");
        }
    }
}
