package String;

/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge,
the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.*/
/*
 * check the equality of string
 * check the length
 * count the char
 *
 * */

import java.util.Scanner;

public class IsAnagram {
    public static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase to handle case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int countA = countCharacter(a, ch);
            int countB = countCharacter(b, ch);

            // Match the length of the character of the both string
            if (countB != countA) {
                return false;
            }
        }
        return true;
    }

    // Count the character of any string
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your String : ");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            if (a.equalsIgnoreCase("exit")) {
                break;
            }
            String b = sc.next();
            System.out.println(isAnagram(a, b));

        }


    }
}
