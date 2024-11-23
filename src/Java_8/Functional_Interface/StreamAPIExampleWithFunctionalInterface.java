package Java_8.Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIExampleWithFunctionalInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Alice", "Bob", "Chris");
        // 1 type
        System.out.println("Using functional interface: ");
        Predicate<String> startWithA = name -> name.toUpperCase().startsWith("A");
        names.stream().filter(startWithA).forEach(System.out::println);

        // 2 nd type
        System.out.println("//////////////////////");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        // distinct and unique result
        System.out.println("Unique result using distinct :");
        names.stream().filter(name -> name.startsWith("A")).distinct().forEach(System.out::println);
    }
}
