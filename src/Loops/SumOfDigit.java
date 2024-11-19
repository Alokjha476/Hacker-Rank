package Loops;

public class SumOfDigit {
    public static int sumOfDigit(int [] array){
        int sumOfDigit = 0;
        int sumOfNumbers= 0;
        for (int j : array) {
            sumOfNumbers = sumOfNumbers + j;

            int current = j;
            while (current > 0) {
                int lastDigit = current % 10;
                sumOfDigit = sumOfDigit + lastDigit;
                current = current / 10;
            }
        }
        return sumOfNumbers-sumOfDigit;
    }
    public static void main(String[] args) {
        int [] array = {1,12};
        int result = sumOfDigit(array);
        System.out.println(result);

    }
}
