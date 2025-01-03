package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMissingElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(2,3);

        List<Integer> missingElement = new ArrayList<>(list1);
        missingElement.removeAll(list2);
        missingElement.forEach(System.out::println);
    }
}
