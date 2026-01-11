package collection;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 5 , 4, 5, 4};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);

            }
        }
    }
}