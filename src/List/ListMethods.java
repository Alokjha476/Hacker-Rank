package List;

import java.util.Arrays;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alok", "Neeraj", "Annand", "xyz");
        List<Integer> integerList = Arrays.asList(1,2,3,2,5,4,1,6,8,10);

        // find the sorted List
        // find the List of element which starts with A
        // find the even no with max element
      List<String> newList =  list.stream().sorted(String::compareTo).toList();
      newList.forEach(System.out::println);
        System.out.println("Print String start with A");
      newList.stream().filter(string -> string.startsWith("A")).forEach(System.out::println);
    }
}
