package Java_8.Functional_Interface;

import java.util.function.Supplier;

// Supplier<T> is a built-in functional interface that does not take any input but supplies a result.
public class UsingSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomValuesSupplier = ()-> Math.random();
        System.out.println(randomValuesSupplier.get());
    }
}
