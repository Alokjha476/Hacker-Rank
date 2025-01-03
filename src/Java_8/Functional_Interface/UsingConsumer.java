package Java_8.Functional_Interface;

import java.util.function.Consumer;

//Consumer<T> is a built-in functional interface that accepts a
// single input and performs some operation without returning any result.
public interface UsingConsumer {
    public static void main(String[] args) {
        Consumer<String> printMsg = msg -> System.out.println("msg  :" + msg);
        printMsg.accept("Hello functional Interface :");
    }
}
