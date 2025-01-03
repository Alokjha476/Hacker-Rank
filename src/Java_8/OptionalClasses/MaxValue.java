package Java_8.OptionalClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*5. Given a list of integers, write a function to find the maximum
value using Optional. If the list is empty, return -1.*/
public class MaxValue {
    public static int maxValue(List<Integer> value) {
        // return value.stream().max(Integer::compareTo).orElse(-1);
        return value.stream().max(Comparator.comparing(Integer::intValue)).orElse(-1);

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 1, 2, 3, 4, 15);
        Integer result = maxValue(integerList);
        System.out.println(result);


    }
}
