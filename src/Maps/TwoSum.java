package Maps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2 sum problem -> return index
public class TwoSum {
    public static int[] findSum(int[] array, int target) {
        // create the Map
        Map<Integer, Integer> map = new HashMap<>();
        // step Put the array in Map
        // target - arr[i] = 3-5= -2 then it will be check in full map rest himself index.
        // check if the value is present or not before
        for (int i = 0; i < array.length; i++) {
            int findMeInMap = target - array[i];
            if (map.containsKey(findMeInMap)) {
                return new int[]{map.get(findMeInMap), i};
            }
            map.put(array[i], i);
        }
        // return map which have the 2 sum  indexes.
        return null;
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 7, 5, -2, 7,4};
        int target = 3;
        System.out.println(Arrays.toString(findSum(array, target)));
    }
}
