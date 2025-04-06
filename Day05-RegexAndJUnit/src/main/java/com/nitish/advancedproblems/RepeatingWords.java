package com.nitish.advancedproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatingWords {
    public static List<String> RepeatedWords(String sentence){
        List<String> list = new ArrayList<>();
        String[] arrWords = sentence.split("\\s+");
        Map<String,Integer> wordCount = new HashMap<>();


        for (String word : arrWords){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        for (Map.Entry<String,Integer> entry : wordCount.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }return list;
    }

    public static void main(String[] args) {
        String sentence = "This is is a repeated repeated word test.";

        List<String> result = RepeatedWords(sentence);
        System.out.println(result);
    }
}
