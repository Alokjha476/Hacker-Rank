package Dsa_Problems;

public class ReverseOfString {
    public static String reverse(String str) {
        String string = " ";
        for (int i = str.length() - 1; i >= 0; i--) {

            string = string + str.charAt(i);

        }
        return string.trim(); // remove the white space
    }

    public static void main(String[] args) {
        String str = "alokKumar      ";
        String result = reverse(str);
        System.out.println(result);
    }
}
