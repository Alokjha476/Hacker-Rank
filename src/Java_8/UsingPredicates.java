package Java_8;

import java.util.function.Predicate;

// Predicate<T> is a built-in functional interface that takes an input and returns a boolean.
public interface UsingPredicates {
    static void main(String[] args) {
        Predicate<String> isLengthGreaterThan = str -> str.length() > 5;
        System.out.println(isLengthGreaterThan.test("Hello world")); // output true
        System.out.println(isLengthGreaterThan.test("Alok"));        // output false


    }
}
