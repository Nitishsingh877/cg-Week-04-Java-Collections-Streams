package mapinterface;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoMapsTest {
    @Test
    void testMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);
        map2.put("B", 3);
        map2.put("C", 4);

        map2.forEach((key, value) ->
                map1.merge(key, value, Integer::sum)
        );

        Map<String,Integer>map = new HashMap<>();
        map.put("A",1);
        map.put("B",5);
        map.put("C",4);

        assertEquals(map,map1,"not passed");
        System.out.println("test case passed");


    }
}