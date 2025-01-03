package Arrays;

public class BubbleSort {
    public static void isSorted(int [] array){

        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j] > array[j+1]){
                    // swap
                    int temp = array[j];

                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
       
    }
    public static void main(String[] args) {
        int [] array = {5,3,4,2,1};
        isSorted(array);
        for (int j : array) {
            System.out.println(j);

        }
    }
}
