package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int [] arr, int n ){

        int length = arr.length;
         n = n % length;
         // reverse the array
         reverse(arr, 0, length-1 );

         reverse(arr, 0, n-1);

         reverse(arr, n, length-1);

    }
    public static void reverse(int [] array, int start , int end) {

        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int n = 2;
        System.out.println("Input Array" + Arrays.toString(array));
        rotateArray(array, n);

        System.out.print("Output Array" + Arrays.toString(array));


        }




        }


