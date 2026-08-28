package project_1;


import java.util.*;

class Employee {

    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + "-" + department + "-" + salary;
    }
}

public class to_string {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Manu", "IT", 60000),
            new Employee("Varun", "HR", 60000),
            new Employee("Vijay", "IT", 60000),
            new Employee("Kumar", "HR", 60000),
            new Employee("Negi", "AT", 60000)
        );

        employees.sort(
                Comparator.comparing((Employee e) -> e.department)
                    .thenComparing((Employee e) -> e.salary, Comparator.reverseOrder())
                    .thenComparing(e -> e.name)
            );

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}