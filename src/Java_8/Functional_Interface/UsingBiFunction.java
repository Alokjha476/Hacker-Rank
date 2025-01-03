package Java_8.Functional_Interface;

import java.util.function.BiFunction;

public interface UsingBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (a,b) -> "sum  " + (a+b);
        System.out.println(biFunction.apply(5,5));
    }
}
