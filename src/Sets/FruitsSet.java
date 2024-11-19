package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FruitsSet {
    public static void main(String[] args) {
        // Operation of Hashset
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        System.out.println(hashSet);  //unordered [Apple, Mango, Banana]

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        System.out.println(linkedHashSet); // ordered [Banana, Apple, Mango]

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        System.out.println(treeSet); // sorted order  [Apple, Banana, Mango]

    }


}
