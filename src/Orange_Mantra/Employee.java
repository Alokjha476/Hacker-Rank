package Orange_Mantra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private Integer id;
    private String name;
    private Date joiningDate; // Date as a Date object
    private int salary;


    // Constructor
    public Employee(Integer id, String name, Date joiningDate, int salary) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // toString Method for Displaying Employee Details
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Employee{id=" + id + ", name='" + name + '\'' +
                ", joiningDate=" + sdf.format(joiningDate) + ", salary=" + salary + '}';
    }

    // Main Method
    public static void main(String[] args) throws ParseException {
        // Date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // List of Employees
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alok", sdf.parse("2024-01-10"), 5000),
                new Employee(2, "Ravi", sdf.parse("2023-05-20"), 7000),
                new Employee(3, "Suman", sdf.parse("2024-01-15"), 6000),
                new Employee(4, "Priya", sdf.parse("2022-08-25"), 8000),
                new Employee(5, "Neha", sdf.parse("2024-01-05"), 4500)
        );

        // Filter employees who joined in January 2024
       /* Calendar calendar = Calendar.getInstance();
        List<Employee> january2024Employees = employeeList.stream()
                .filter(employee -> {
                    calendar.setTime(employee.getJoiningDate());
                    return calendar.get(Calendar.YEAR) == 2024 &&
                            calendar.get(Calendar.MONTH) == Calendar.JANUARY;
                })
                .toList();*/

        Calendar calendar = Calendar.getInstance();
        List<Employee> jan2024 = employeeList.stream().filter(employee-> {
            calendar.setTime(employee.getJoiningDate());
            return calendar.get(Calendar.YEAR) == 2024 && calendar.get(Calendar.MONTH)== Calendar.JANUARY;
        }).toList();

        // Print employees who joined in January 2024
        System.out.println("Employees who joined in January 2024:");
        jan2024.forEach(System.out::println);
    }
}
