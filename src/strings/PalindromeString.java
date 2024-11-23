package strings;

import java.util.Scanner;

public class PalindromeString {
    private static boolean isPalindrome(String s) {
        int n = s.length()-1;
        for (int i = 0; i <Math.sqrt(n); i++) {
            if (s.charAt(i) != s.charAt(n-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}

