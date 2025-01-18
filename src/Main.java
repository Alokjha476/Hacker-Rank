public class Main {
    public static int maxHighest(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;


        for (int j : array) {
            if (firstHighest < j) {
                firstHighest = j;
            } else if (secondHighest < j && j < firstHighest) {
                secondHighest = j;
            } else if (thirdHighest < j && j < secondHighest) {
                thirdHighest = j;
            }

        }
        return thirdHighest;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, 8, 1}; // print 4
        System.out.println(maxHighest(array));

    }
}