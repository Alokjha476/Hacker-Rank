package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
/*If the key already exists in the map, the put() method updates the
 value associated with the key and returns the old value.
If the key does not exist, the put() method adds
the key-value pair to the map and returns null.
 */

public class MapPutExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        int value = map.put("Apple", 10);
        Optional<Integer> integerOptional = Optional.ofNullable(value);
        integerOptional.ifPresentOrElse(value1 -> System.out.println("replaced value" + value1), () -> System.out.println("no previous value of the key:"));

        Optional<Set<Map.Entry<String, Integer>>> setOptional = Optional.ofNullable(map.entrySet());
        setOptional.ifPresent(entries -> {
            if (!entries.isEmpty()) {
                System.out.println("Map entries");
                entries.forEach(System.out::println);
            } else {
                System.out.println("Map is empty:");
            }
        });


//        int oldValue = map.put("Apple", 50);
//        System.out.println(oldValue);
//        int oldValue1 = map.put("Apple", 90);
//        System.out.println(oldValue1);
//        // print the oldValue1 = Apple= 50
    }
}
