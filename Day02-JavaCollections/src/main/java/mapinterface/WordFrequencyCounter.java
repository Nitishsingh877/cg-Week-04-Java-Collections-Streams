package mapinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String,Integer> countWordFrequency(String filePath){
        Map<String,Integer> wordCount = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            //remove puncuations
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                //split words

                String[] words = line.split("\\s+");

                //count frequency
                for (String word : words){
                    if(!word.isEmpty()){
                        wordCount.put(word, wordCount.getOrDefault(word,0)+1);
                    }
                }

            }
        }catch (IOException e){
            System.out.println("error while file handling" + e.getStackTrace());
        }return  wordCount;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\HashMap.txt";

        Map<String, Integer> wordFreq = countWordFrequency(filePath);

        //printing
//        for(Map.Entry<String,Integer> entry : wordFreq.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        System.out.println(wordFreq);
    }

}
