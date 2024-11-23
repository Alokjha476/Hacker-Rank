package Maps;

import java.math.BigInteger;
import java.util.*;

public class Person {
    private  Integer id;
    private  String name;
    private  String number;

    public Person(Integer id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, "Alok", "98989898"));
        personMap.put(2, new Person(2,"Abhi", "98786868"));
        personMap.put(3, new Person(3, "Kamal", "9878979821"));

        //Sort by Key
       List<Map.Entry<Integer, Person>> person = new ArrayList<>(personMap.entrySet());
       person.sort(Map.Entry.comparingByKey());
       person.forEach(System.out::println);

        // sort by id
        List<Map.Entry<Integer, Person>> personList = new ArrayList<>(personMap.entrySet());
        personList.sort(Comparator.comparing(entry-> entry.getValue().getId()));
        personList.forEach(System.out::println);

        // sort by name
        List<Map.Entry<Integer, Person>> personList1 = new ArrayList<>(personMap.entrySet());
        personList1.sort(Comparator.comparing(entry-> entry.getValue().getName()));
        personList1.forEach(System.out::println);

        // sort by number
        List<Map.Entry<Integer, Person>> personList2 = new ArrayList<>(personMap.entrySet());
        personList2.sort(Comparator.comparing(entry-> entry.getValue().getId()));
        personList2.forEach(System.out::println);

    }

}
