package collection;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        /*String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }*/
        StringBuilder sb = new StringBuilder(str);
    String string =  sb.reverse().toString();
   if (str.equals(string)) {
         System.out.println(str + " is a palindrome string");
    } else {
         System.out.println(str + " is not a palindrome string");
   }

    }
}
