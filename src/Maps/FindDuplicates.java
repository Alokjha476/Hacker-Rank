package Maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateValueList = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 7);
        Set<Integer> uniqueElement = new HashSet<>();
        for (Integer value : duplicateValueList) {
            uniqueElement.add(value);
        }
        System.out.println(uniqueElement);
    }
}
