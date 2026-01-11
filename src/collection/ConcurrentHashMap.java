package collection;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.concurrent.ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        for(int key : map.keySet()){
           map.put(4, "four");

        }
        System.out.println(map);

    }
}
