package Hackers;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static int countGreaterThanPreviousAverage(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        int count = 0;
        long sum = arr[0]; // first element ka sum

        for (int i = 1; i < arr.length; i++) {
            double average = (double) sum / i;

            if (arr[i] > average) {
                count++;
            }

            sum += arr[i]; // sum update
        }

        return count;
    }

    public static int countGreaterThanPreviousAverage(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return 0;
        }
        int count = 0;
        long sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            double average = (double) sum / i;
            if (list.get(i) > average) {
                count++;
            }
            sum += list.get(i);
        }
        return count;

    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int result = countGreaterThanPreviousAverage(responseTimes);
        System.out.println(result); // Output: 2
        List<Integer> integerArrayList = new ArrayList<>();
        for (int responseTime : responseTimes) {
            integerArrayList.add(responseTime);
        }
//        System.out.println(integerArrayList);
        int countOfList = countGreaterThanPreviousAverage(integerArrayList);
        System.out.println(countOfList);

    }
}
