package Maps;

import java.util.Map;
import java.util.TreeMap;
// sort by key using treemap
public class SortByKey {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 10);
        treeMap.put("Cherry", 30);

        System.out.println(treeMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }
}
