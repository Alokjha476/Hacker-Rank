package strings;

import java.util.Scanner;


public class LargestSubString {
    private static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {

            String substring = s.substring(i, i + k); // 1+3
            System.out.print(substring + " ");

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return "\n" + smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); // Input the string
        int k = scan.nextInt(); // Input the length of substrings
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }


}
/*Sample Input 0
welcometojava
3
Sample Output 0
ava
wel*/
/*
        Return Values:
        The method returns an integer value based on the lexicographical comparison:

        Negative Value: If string1 is lexicographically less than string2.
        Zero: If string1 is lexicographically equal to string2.
        Positive Value: If string1 is lexicographically greater than string2.
        Lexicographical Comparison:
        Lexicographical order is similar to dictionary order.
        Each character is compared based on its Unicode value.

*/

