package ComparatorAndComparable;

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // Ascending order by age
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Ascending order by name
    }

}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 22),
                new Student("Bob", 20),
                new Student("Charlie", 23)
        );
        students.sort(new NameComparator());
        Collections.sort(students);
        System.out.println("Sorted by name:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);

        }

        // Age sorting
        System.out.println("Sorted by age:");
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);

        }


    }
}
