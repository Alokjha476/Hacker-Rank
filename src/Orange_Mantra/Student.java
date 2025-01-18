package Orange_Mantra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private Integer id;
    private Date enrollmentDate;
    private String name;
    private Integer rollNum;

    public Student(Integer id, Date enrollmentDate, String name, Integer rollNum) {
        this.id = id;
        this.enrollmentDate = enrollmentDate;
        this.name = name;
        this.rollNum = rollNum;
    }

    public Integer getId() {
        return id;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public Integer getRollNum() {
        return rollNum;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNum(Integer rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Student{" + "id=" + id + ", enrollmentDate=" + sdf.format(enrollmentDate) + ", name='" + name + '\'' + ", rollNum=" + rollNum + '}';
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Student> studentList = Arrays.asList(new Student(1, sdf.parse("2024-01-01"), "alok", 1), new Student(2, sdf.parse("2024-01-20"), "neeraj", 2), new Student(5, sdf.parse("2025-01-31"), "aman", 3), new Student(4, sdf.parse("2024-01-13"), "Bhavna", 5), new Student(3, sdf.parse("2024-03-14"), "Anshu", 10));
        // find the data which enrollment date is 2024 January and 2025 january
        Calendar calendar = Calendar.getInstance();
        List<Student> students = studentList.stream().filter(employee -> {
            calendar.setTime(employee.getEnrollmentDate());
            return calendar.get(Calendar.YEAR) == 2024 && calendar.get(Calendar.MONTH) == Calendar.JANUARY;


        }).toList();
        // students.forEach(System.out::println);

        // 2-- sort By name
        System.out.println("Student sort by name");
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentList);

        System.out.println("Student sort by Date ");
        studentList.sort(Comparator.comparing(Student::getEnrollmentDate));
        System.out.println(studentList);

        System.out.println("Student sort by roll number");
        studentList.sort(Comparator.comparing(s -> s.getRollNum()));
        System.out.println(studentList);
        // transform of each element in the stream
        System.out.println("print all name only which is in List of Employee:");
        List<String> students1 = studentList.stream().map(Student::getName).toList();
        System.out.println(students1);
        List<Integer> length = students1.stream().map(String::length).toList();
        length.forEach(System.out::println);

        List<String> studentNames = studentList.stream().map(Student::getName).filter(nameName -> nameName.startsWith("a")).toList();
        System.out.println(studentNames);


    }


}

