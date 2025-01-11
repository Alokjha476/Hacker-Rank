package Arrays;

public class MaxSum {
    public static  int maxSumArray(int [] array){
        int maxSum = 0;
        for (int i = 0; i <array.length ; i++) {

            for (int j = i+1; j < array.length; j++) {
                int sum =array[i] + array[j];
                if (maxSum< sum ){
                    maxSum = sum;
                }

            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {1, -1, 2, 3, 0, 6,-1,-22, 10};
       int maxSumArray = maxSumArray(array);
        System.out.println(maxSumArray);

    }

}