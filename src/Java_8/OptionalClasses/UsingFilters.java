package Java_8.OptionalClasses;

import java.util.Optional;
// Optional class using with filters
public class UsingFilters {
    public static void main(String[] args) {
        Optional<String> string = Optional.of("Java");
        string.filter(value -> value.startsWith("J")).
                ifPresent(value-> System.out.println("Filtered value "+ value));

        // second way

        String result = Optional.of("Java").map(String::toUpperCase).filter(value -> value.length()>3).orElse("Default");
        System.out.println(result);
    }
}
