package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindWordOccurrence {
    public static Map<String, Integer> findOccurrenceWord(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : str.split("[^0-9A-Za-z]+")) { // exclude every special character including " "
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }

        }
        return map;
    }

    public static void main(String[] args) {
        String str = "My name @ is Alok. Alok is very clever man. man is not clever.";
        System.out.println(findOccurrenceWord(str));

    }

}
