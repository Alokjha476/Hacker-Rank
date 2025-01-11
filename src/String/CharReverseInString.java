package String;

import java.util.Arrays;
// reverse the every character in same location
public class CharReverseInString {
    public static StringBuilder reverseWord(String str){
       String reverseString  = new StringBuilder(str).reverse().toString();

       String[] word = reverseString.split(" ");
       StringBuilder sb = new StringBuilder();
        for (int i = word.length-1; i >= 0 ; i--) {
            sb.append(word[i]).append(" ");

        }
        return sb;

    }
    public static void main(String[] args) {
        String str = "My name is Alok kumar";
        System.out.println(reverseWord(str));

    }
}
