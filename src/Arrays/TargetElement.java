package Arrays;

public class TargetElement {
    private static int findTargetElement(int[] array,int target) {
        int left = 0;
        int right = array.length-1;
        while (left<= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
             if (target > array[mid]){ // check the right half
                 left = mid+1;
             }
             else {
                 right = mid-1;
             }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        int target = 3;
       int result =  findTargetElement(array,  target);
        System.out.println(result);
    }


}
