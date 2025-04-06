package com.nitish.advancedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExtractProggNames {
    public static List<String> SetOfWords(String sentence, List<String> language) {
        List<String> result = new ArrayList<>();
        String[] words = sentence.replaceAll("[^a-zA-z ]", "").split("\\s+");

        for (String word : words) {
            if (language.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String sentence = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> list = new ArrayList<>(Arrays.asList("Java","Python","JavaScript","Go"));

        List<String> result = SetOfWords(sentence,list);
        System.out.println(result);
    }
}
