package Dsa_Problems;

import java.util.Arrays;

// it will work only sorted array
public class RemoveDuplicates {
    public static void isDistinct(int[] array) {
        int newArraySize = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            if (current != array[i + 1]) {
                array[newArraySize] = array[i];
                newArraySize++;
            }
        }
        array[newArraySize] = array[array.length - 1];
        for (int i = 0; i <= newArraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 5, 5, 6, 5, 4, 7};
        Arrays.sort(array);
        isDistinct(array);
    }
}
