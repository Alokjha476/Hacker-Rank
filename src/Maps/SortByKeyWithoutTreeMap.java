package Maps;

import java.util.*;

public class SortByKeyWithoutTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(5, "Banana");
        map.put(6, "Cherry");
        map.put(2, "Papaya");
        map.put(1, "Pomegranate");

        Map<Integer, String> map2 = new TreeMap<>(map);
        System.out.println(map2);// map sorted by key using TreeMap
        System.out.println(map.containsKey(3));// return true and false
        // comparing by key
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByKey());
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry); // map sorted by key without using TreeMap
        }
        // comparing by Value
        List<Map.Entry<Integer, String>> entries1 = new ArrayList<>(map.entrySet());
        entries1.sort(Map.Entry.comparingByValue());
        // given output without list
        System.out.println(entries1); //map sorted by value without using TreeMap
        for (Map.Entry<Integer, String> entry : entries1) {
            // given output as list
            System.out.print(entry + " ");
        }
    }
}
