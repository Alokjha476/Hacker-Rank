package Dsa_Problems;

public class ReverseWord {
    public static String wordReverse(String str){
        String[] word = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length-1; i >= 0 ; i--) {
            sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "my name is alok kumar"; // output: kumar alok is name my
        System.out.println(wordReverse(str));
    }
}
