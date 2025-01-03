package Arrays;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8};

        int newLength = array1.length+ array2.length;
        int [] newArray = new int[newLength];

        for (int i = 0; i < array1.length ; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0 ; i < array2.length ; i++) {
            newArray[array1.length+i] = array2[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
