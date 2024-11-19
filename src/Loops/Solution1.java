package Loops;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // (a+2^0 * b), (a+2^0 * b+ a^1 *b),
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test case :");
        int testCase = sc.nextInt();
        for (int t = 0; t < testCase; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            generateSequence(a,b,n);
        }
        sc.close();
    }
    public static void generateSequence(int a, int b, int n) {
        int current = a;
        for (int i = 0; i < n; i++) {

            current = (int) (current + Math.pow(2, i) * b);
            System.out.print(current + " ");

        }
        System.out.println();

    }

}
