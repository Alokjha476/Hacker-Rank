package Java_8.OptionalClasses;

import java.util.Optional;

/*6. Write a method to check if an Optional<String>
contains a string that starts with "A". Return true if it does,
or false otherwise.*/
public class  IsPresent {
    public static  boolean isPresent(Optional<String> str) {

    return str.filter(v->v.startsWith("A")).isPresent();
    }

    public static void main(String[] args) {
        Optional<String> name1 = Optional.of("Apple");
        Optional<String> name2 = Optional.of("Banana");
        Optional<String> empty = Optional.empty();

        System.out.println(isPresent(name1)); // Output: true
        System.out.println(isPresent(name2)); // Output: false
        System.out.println(isPresent(empty)); // Output: false



    }
}
