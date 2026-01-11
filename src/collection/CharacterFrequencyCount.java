package collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {
    public static void main(String[] args) {
        String str = "java";
        Map<Character, Integer> map = new HashMap<>();

        char [] charToArray = str.toCharArray();
        for(char c : charToArray){
            map.put(c, map.getOrDefault(c,0) + 1);
        } // [j=1, a=2, v=1]
        System.out.println(map);
    }
}
