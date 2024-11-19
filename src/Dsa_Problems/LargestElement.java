package Dsa_Problems;

public class LargestElement {
    private static int largestElement(int[] array) {
        int firstLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (firstLargest < array[i]) {
                firstLargest = array[i];
            } else if (secondLargest < array[i] && array[i] < firstLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println(firstLargest);
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 15, 3, 6, 5};
        int largest = largestElement(array);
        System.out.println(largest);
    }
    }
