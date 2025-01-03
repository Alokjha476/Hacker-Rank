package strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void remove(String string){

    }
    public static void main(String[] args) {
        String str = "aababccddddd";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length-1 ; i++) {
            if (ch[i] != ch[i+1]){
                sb.append(ch[i]);
            }
        }
        sb.append(ch[ch.length-1]);
        System.out.print(sb+ " ");

    }
}
