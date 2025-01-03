package Java_8.OptionalClasses;

import java.util.Optional;

public class AvoidNullPointerExc {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null);
        //Optional<String> string1 = Optional.of(null); // Null pointer exception
        Optional<String> string2 = Optional.empty(); // No Null Pointer Exception
        String str = string.orElse("Default value :"); // Handle Null pointer Exception
        System.out.println(str);


    }
}
