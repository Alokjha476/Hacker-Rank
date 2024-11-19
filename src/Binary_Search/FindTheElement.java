package Binary_Search;
// Works with sorted array only
public class FindTheElement {
    public static int findElement(int[] array, int left, int right, int targetElement) {
        if (left> right){
            return -1;
        }
       int mid = left+ (right-left)/2;
        if (array[mid] == targetElement){
            return mid;
        }
        else if (array[mid] < targetElement){
            return findElement(array, mid+1, right, targetElement);
        }else {
            return findElement(array, left, mid-1, targetElement);
        }




    }

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};
        int result =  findElement(array, 0, array.length-1, 7);
        System.out.println(result);

    }
}
