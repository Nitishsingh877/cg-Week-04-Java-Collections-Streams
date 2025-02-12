package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("key with max value is  " + maxKey + " = " + maxValue);
    }
}
