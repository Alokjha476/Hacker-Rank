package Java_8.OptionalClasses;

import java.util.Optional;

public class OptionalOperations {
    public static void main(String[] args) {
        // Create an Optional
        Optional<String> name  = Optional.of("Java");
        // Map, filter, and transform
        name.map(String :: toUpperCase).filter(value -> value.startsWith("J"))
                .ifPresentOrElse(System.out::println, ()-> System.out.println("No value found:"));
        // FlatMap example
      Optional<String>  string = name.flatMap(val-> Optional.of(val.toLowerCase()));
        System.out.println(string);
    }
}
