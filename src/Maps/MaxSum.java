package Maps;

import java.util.HashMap;
import java.util.Map;

// find the Max sum in array
public class MaxSum {
    public static int findMaxSum(Map<String, int[]> map) {
        int maxSum = 0;
        int currentMaxSum = 0;
        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            int[] number = entry.getValue();
            for (int num : number) {
                currentMaxSum = currentMaxSum + num;
                if (maxSum < currentMaxSum) {
                    maxSum = currentMaxSum;
                }
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {0, -1, 2, 6, 3, 4, 4, 5};
        Map<String, int[]> map = new HashMap<>();
        map.put("key1", array);
        int maxSum = findMaxSum(map);
        System.out.println("Max value is :" + maxSum);
    }
}
