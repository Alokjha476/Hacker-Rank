package WebWee_Company;

import java.util.Scanner;

public class MathClass {
    public static  int power(int num, int pow){
        int f = 1;
        while (pow > 0) {
            f = f * num;
            pow--;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(number, pow));

    }
}
