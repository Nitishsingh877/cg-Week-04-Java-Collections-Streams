package listinterface.reversealist.findfrequencyofelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static Map<String, Integer> countFrequency(List<String> words){
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word  : words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word,0)+1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");

        Map<String, Integer> freq = countFrequency(stringList);
        System.out.println(freq);

    }

}
