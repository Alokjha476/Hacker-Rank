package Linear_Search;

public class FindMaxElements {
    public static int largestElement(int [] array){
        int firsLargest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (firsLargest < array[i]){
                firsLargest = array[i];
            }
            else if(secondLargest< array[i] && array[i] < firsLargest){
                secondLargest = array[i];
            }
            else if(thirdLargest< array[i] && array[i] < secondLargest){
                thirdLargest = array[i];
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args) {
        int [] array = {1,2,10,8,9,7,6,5,4};
        int result1 = largestElement(array);
        System.out.println(result1);
    }
}
