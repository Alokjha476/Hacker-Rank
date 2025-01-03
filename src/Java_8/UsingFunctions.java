package Java_8;

import java.util.function.Function;

// Function<T, R> is a built-in functional interface that accepts one input and produces a result.
public interface UsingFunctions {
    public static void main(String[] args) {
        Function<Integer, String> intToString = num -> "Number" + num;
        System.out.println(intToString.apply(10));  // Output: Number: 10
    }
}
