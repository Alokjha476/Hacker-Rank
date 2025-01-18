package WebWee_Company;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);

    }
    public static int factorialByMethod(int n) {

        int num = 1;
        for (int i = n; i >= 1; i--) {
            num = num * i;
        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println("Enter you number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorialByMethod(n));
    }
}
