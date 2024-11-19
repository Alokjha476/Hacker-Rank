package strings;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        System.out.println("Enter your string :");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int totalLength = a.length() + b.length();
        System.out.println(totalLength);
        // 2. Compare lexicographically
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
        String output = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() + " " + b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();
        System.out.println(output);


    }

}
