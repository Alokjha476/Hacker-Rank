package edunext;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persons {

    private Integer id;
    private String name;
    private String email;
    private String city;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setCity(String city) {
        this.city = city;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return id + " : " + name + " : " + city + " : " + email + " : ";

    }

    public Persons(Integer id, String name, String city, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;

    }

    public static void main(String[] args) {

        List<Persons> list = List.of(new Persons(1, "Alok", "Bareilly", "Na"));
        List<Persons> list1 = List.of(new Persons(2, "Madan", "Bareilly", "Na"));
        List<Persons> list2 = List.of(new Persons(3, "Kamal", "Meerganj", "Na"));
        List<Persons> list3 = List.of(new Persons(6, "Kanchan", "Kichha", "Na"));
        List<Persons> list4 = List.of(new Persons(5, "Alok", "Kichha", "Na"));
        List<Persons> list5 = List.of(new Persons(4, "Ajay", "Delhi", "Na"));
        List<Persons> list6 = List.of(new Persons(7, "Neeraj", "Meerganj", "Na"));

        Map<Integer, List<Persons>> listMap = new HashMap<>();
        listMap.put(1, list);
        listMap.put(2, list1);
        listMap.put(3, list2);
        listMap.put(5, list3);
        listMap.put(4, list4);
        listMap.put(6, list5);
        listMap.put(7, list6);
       // System.out.println(listMap);

        for (Map.Entry<Integer, List<Persons>> entry : listMap.entrySet()){
           List< Persons> value = entry.getValue();
           Integer key = entry.getKey();

           // System.out.println(value);
          //  value.stream().filter(values-> values.getCity().contains("Bareilly")).forEach(System.out::println);
           // value.stream().filter(value1-> value1.getName().startsWith("A")).forEach(System.out::println);
            value.sort(Comparator.comparing(Persons::getName));
            System.out.println("Sorted List ");
            value.forEach(System.out::println);
        }


        






    }
}
