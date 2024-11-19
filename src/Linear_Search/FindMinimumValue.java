package Linear_Search;

public class FindMinimumValue {
    public static void main(String[] args) {
        int[] arr = {10, 15, 9, 4, 7, 6, 20, 21};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }

        }
        System.out.println(min);
    }
}
