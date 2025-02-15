package com.nitish.replaceandmodifystrings;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CensorBadWords {

    public static String censor(String sentence, Set<String> badWords){
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            String lowercaseWords = word.toLowerCase();
            if(badWords.contains(lowercaseWords)){
                sb.append(" ***** ");
            }else {
                sb.append(word).append(" ");
            }
        }return sb.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        Set<String> badWords = new HashSet<>(Arrays.asList("damn", "stupid"));

        String censored = censor(sentence,badWords);
        System.out.println(censored);
    }

}
