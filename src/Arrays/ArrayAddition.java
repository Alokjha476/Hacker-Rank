package Arrays;
// 2 sum problem by
public class ArrayAddition {
    public static void add(int[] array, int target) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length-1; j++) {
                sum = array[i] + array[j];
                if (sum == target) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 2, 3, 4, -1, 0};
        int target = 2;
        add(arr, target);
    }
}
