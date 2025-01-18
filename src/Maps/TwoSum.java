package Maps;

import java.util.*;

public class TwoSum {
    public static List<int[]> findAllSums(int[] array, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        // Populate the map and find pairs
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                for (int index : map.get(complement)) {
                    result.add(new int[]{index, i});
                }
            }

            // Add current element's index to the map
            map.putIfAbsent(array[i], new ArrayList<>());
            map.get(array[i]).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 7, 5, -2, 7, 4};
        int target = 9;

        List<int[]> pairs = findAllSums(array, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
