package Maps;

import java.util.HashMap;
import java.util.Map;
/*If the key already exists in the map, the put() method updates the
 value associated with the key and returns the old value.
If the key does not exist, the put() method adds
the key-value pair to the map and returns null.
 */

public class MapPutExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("cherry", 30);
        System.out.println("Initial map:" + map);
        int oldValue = map.put("Apple", 50);
        System.out.println(oldValue);
        int oldValue1 = map.put("Apple", 90);
        System.out.println(oldValue1);
        // print the oldValue1 = Apple= 50
    }
}
