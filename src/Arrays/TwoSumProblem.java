package Arrays;

public class TwoSumProblem {
    public static void Sum2Problem(int [] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int sum= array[i] + array[j];
                if (sum == target){
                    System.out.println(i + " " + j);
                }


            }
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,-2,3,4,5};
        int target = 7;
        Sum2Problem(array, target);

    }
}
