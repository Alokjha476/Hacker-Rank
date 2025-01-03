package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        //converting an object to one of its fields or applying some logic to each element
        List<String> list = Arrays.asList("Kamal", "Neeraj", "Alok");
        List<Integer> length = list.stream().map(String::length).collect(Collectors.toList());
     //   System.out.println(length);
        // using flat map
        //When you have a collection of collections (e.g., a List<List<T>>)
        // and need to flatten it into a single collection for processing.
        List<List<String>> lists = List.of(List.of("Kamal", "Piyush", "Alok"), List.of("One", "Two"));
       List<String> list1 =  lists.stream().flatMap(List::stream).collect(Collectors.toList());
       list1.forEach(System.out::println);
    }
}
