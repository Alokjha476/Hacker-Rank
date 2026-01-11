package collection;

import java.lang.reflect.Array;
import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana", "apple");
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4);
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }

}
