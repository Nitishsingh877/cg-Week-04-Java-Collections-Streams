package mapinterface;

import java.util.*;

public class GroupObjectbyProperty {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Alice", "HR");
        map.put("Bob", "IT");
        map.put("Carol", "HR");

        Map<String, List<String>> Response = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();


            Response.computeIfAbsent(value, k ->new ArrayList<>()).add(key);
        }
        System.out.println(Response);
    }
}
