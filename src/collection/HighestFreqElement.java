package collection;

import java.util.HashMap;
import java.util.Map;

public class HighestFreqElement {
    public static void main(String[] args) {
        String str = "aalok";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // output [a = 2, l=1,o =1,k =1]

        int maxValue = Integer.MIN_VALUE;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            int value = entry.getValue();
//            if (value > maxValue) {
//                maxValue = value;
//                System.out.println("Highest frequency element is: " + entry.getKey() + " with frequency: " + maxValue);
//
//            }
//
//        }
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                System.out.println("Highest frequency element is: " + key + " with frequency: " + maxValue);

            }
        }





    }
}
