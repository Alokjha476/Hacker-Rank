package collection;

import java.util.HashMap;
import java.util.Map;

public class HighestKeyAgainstValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

        String highestKey = null;
        int highestValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestValue) {
                highestValue = entry.getValue();
                highestKey = entry.getKey();
            }
        }
        System.out.println(highestValue + "=" + highestKey);
    }
}
