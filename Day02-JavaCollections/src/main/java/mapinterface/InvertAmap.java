package mapinterface;

import java.util.*;

public class InvertAmap {
    public static void main(String[] args) {
        HashMap<String,Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("A",1);
        stringIntegerHashMap.put("B",2);
        stringIntegerHashMap.put("C",1);

        Map<Integer, List<String>> integerStringHashMap = new HashMap<>();
        for(Map.Entry<String ,Integer> entry : stringIntegerHashMap.entrySet() ){
           // integerStringHashMap.put(entry.getValue(), Collections.singletonList(entry.getKey()));
            int key = entry.getValue();
            String value = entry.getKey();

            // If key already exists, add to existing list; otherwise, create a new list
            integerStringHashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }
        System.out.println(integerStringHashMap);
    }
}
