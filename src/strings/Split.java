package strings;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        String str = "Enter your string: ";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("[^a-zA-Z0-9]+");
        System.out.println(words.length);
        /*int word_length = 0;
        for (String word1 : words) {
            if (!word1.isEmpty()) {
                word_length++;
            }

        }
        System.out.println(word_length);*/
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

    }
}
