package mapinterface;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        map1.put("A",1);
        map1.put("B",2);
        map2.put("B",3);
        map2.put("C",4);

        map2.forEach((key,value) ->
          map1.merge(key, value, Integer::sum)
        );

        System.out.println(map1);
        }
    }

