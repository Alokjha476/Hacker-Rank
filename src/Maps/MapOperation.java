package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOperation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, words);

        for (Map.Entry<Integer, List<String>> listEntry : map.entrySet()) {
            List<String> value = listEntry.getValue();
            Integer key = listEntry.getKey();
            System.out.println(value);

            for (String value1 : value) {
                if (value1.toUpperCase().startsWith("C")) {
                    System.out.println(value1);

                }

            }
        }


    }
}
