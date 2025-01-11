package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurrence {
    public static Map<Character, Integer> findCharacterOccurrence(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "aallloookkkjhaa";
        System.out.print(findCharacterOccurrence(str));

    }
}
