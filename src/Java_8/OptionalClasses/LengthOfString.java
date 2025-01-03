package Java_8.OptionalClasses;

import java.util.Optional;
import java.util.Scanner;

/*
// find Length By Optional class
1. Write a function that accepts a String and returns
the length of the string using Optional. If the string is null, return 0.
*/
public class LengthOfString {
    public static int length(String s) {
        return Optional.of(s).map(String::length).orElse(0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(length(s));


    }
}
