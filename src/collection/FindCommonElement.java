package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElement {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,1,2,5,6,7,8,9,10));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(1,2,3,1,2,5,6,7,8,9,10));
        num1.retainAll(num2);
        System.out.println("Common elements: " + num1);


    }
}
