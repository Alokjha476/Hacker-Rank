package Dsa_Problems;

public class MovesAllZero {
    public static void moveAllZeroEnd(int[] array) {
        int newArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[newArray] = array[i];
                newArray++;
            }

        }
        for (int i = newArray; i <array.length ; i++) {
            array[i] = 0;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 0, 0, 5};
        moveAllZeroEnd(array);
    }
}
