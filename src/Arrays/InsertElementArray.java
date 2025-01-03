package Arrays;

import java.util.Arrays;

public class InsertElementArray {
    public static int[] insertElement(int[] array, int element) {
        // Create a new array with an extra space
        int[] array1 = new int[array.length + 1];
        int findIdx = 0;

        // Find the correct index to insert the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] < element) {
                findIdx++;
            } else {
                break;
            }

        }
        // Copy elements into the new array with the element inserted
        for (int i = 0; i < array1.length; i++) {
            if (i < findIdx) {
                array1[i] = array[i];
            } else if (i == findIdx) {
                array1[i] = element;
            } else {
                array1[i] = array[i - 1];
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int insertElement1 = 5;
        System.out.println(Arrays.toString(insertElement(array, insertElement1)));
    }
}
