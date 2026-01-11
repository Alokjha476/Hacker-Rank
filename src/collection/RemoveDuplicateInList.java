package collection;

import java.util.*;

public class RemoveDuplicateInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,5,6,7,8,9,10);
        System.out.println(list);
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set); // Output will be a set with duplicates removed


        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer num : list) {
           if (!seen.add(num)) {
               duplicates.add(num);
           }
        }
        System.out.println(seen); // Output will be the original list without duplicates
        System.out.println(duplicates); // Output will be the duplicates only


    }
}

