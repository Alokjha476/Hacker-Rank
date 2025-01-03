package Arrays;

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
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 0, 0, 5,5,3,5,0,0,5,5,4,4};
        moveAllZeroEnd(array);
    }
}
