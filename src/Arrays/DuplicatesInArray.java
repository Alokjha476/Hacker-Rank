package Arrays;

import java.util.Scanner;

public class DuplicatesInArray {
    private static boolean isTwice(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            if (current == array[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(isTwice(array));
    }
}
