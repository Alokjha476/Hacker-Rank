package String;

import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String result = s.substring(start, end);
        System.out.print(result);
    }
}
