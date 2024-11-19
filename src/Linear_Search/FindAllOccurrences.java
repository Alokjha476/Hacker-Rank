package Linear_Search;

import java.util.ArrayList;
import java.util.List;

// Linear search works on unsorted array
public class FindAllOccurrences {
    private static List<Integer> findAllOccurrences(int[] array, int targetElement) {
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                positions.add(i);
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 5, 6, 7, 2, 7, 7};
        int targetElement = 7;
        List<Integer> result = findAllOccurrences(array, targetElement);
        System.out.println(targetElement + " : " + result);

    }


}
