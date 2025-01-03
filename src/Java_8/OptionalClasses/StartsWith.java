package Java_8.OptionalClasses;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
    public static String findStringStartingWithJ(List<String> list) {
        //return list.stream().filter(s->s.startsWith("J")).findFirst().orElse("No match found:"); // print Java
        return list.stream().map(String::toUpperCase)
                .filter(value -> value.startsWith("J"))
                .findFirst().orElse("No Match found"); // print JAVA

    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Java", "Python", "JavaScript");
        System.out.println(findStringStartingWithJ(names)); //Output:  Java

        List<String> emptyList = Arrays.asList("Apple", "Python");
        System.out.println(findStringStartingWithJ(emptyList)); // Output: No Match Found


    }
}
