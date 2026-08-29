package Project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_Employee {

    // Employee class
    static class Employee {
        String name;
        int age;
        String designation;
        double salary;

        // Constructor
        Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean exitProgram = false;

    public static void main(String[] args) {

        int choice = 0;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Menu validation
            try {
                choice = Integer.parseInt(sc.nextLine().trim());

                switch (choice) {

                    case 1:
                        create();
                        break;

                    case 2:
                        display();
                        break;

                    case 3:
                        raiseSalary();
                        break;

                    case 4:
                        exit();
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter numbers only.");
            }

        } while (!exitProgram);

        sc.close();
    }

    // ================= CREATE =================

    static void create() {

        String again;

        do {

            // Name validation
            String name;

            while (true) {

                System.out.print("Enter name: ");
                name = sc.nextLine().trim();

                // Only alphabets and maximum 3 words
                if (name.matches("[a-zA-Z]+( [a-zA-Z]+){0,2}")) {
                    break;
                }

                System.out.println(
                    "Invalid name. Enter only alphabets and maximum 3 words."
                );
            }

            // Age validation
            int age;

            while (true) {

                System.out.print("Enter age (18-60): ");

                try {
                    age = Integer.parseInt(sc.nextLine().trim());

                    if (age >= 18 && age <= 60) {
                        break;
                    }

                    System.out.println(
                        "Invalid age. Age must be between 18 and 60."
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                        "Invalid age. Please enter numbers only."
                    );
                }
            }

            // Designation validation
            String letter;

            while (true) {

                System.out.print(
                    "Enter designation (p - Programmer, " +
                    "t - Tester, m - Manager): "
                );

                letter = sc.nextLine().trim().toLowerCase();

                if (letter.equals("p") ||
                    letter.equals("t") ||
                    letter.equals("m")) {

                    break;
                }

                System.out.println(
                    "Invalid input. Please enter p, t, or m."
                );
            }

            // Set designation and salary
            String designation;
            double salary;

            if (letter.equals("m")) {

                designation = "Manager";
                salary = 50000;

            } else if (letter.equals("p")) {

                designation = "Programmer";
                salary = 35000;

            } else {

                designation = "Tester";
                salary = 25000;
            }

            // Add employee
            employees.add(
                new Employee(name, age, designation, salary)
            );

            System.out.println(
                name + " added with base salary " + salary
            );

            // Add another employee
            while (true) {

                System.out.print(
                    "Add another person? (yes/no): "
                );

                again = sc.nextLine().trim().toLowerCase();

                if (again.equals("yes") ||
                    again.equals("no")) {

                    break;
                }

                System.out.println(
                    "Invalid input. Please enter yes or no."
                );
            }

        } while (again.equals("yes"));
    }

    // ================= DISPLAY =================

    static void display() {

        if (employees.isEmpty()) {

            System.out.println(
                "No employees created yet."
            );

            return;
        }

        System.out.println(
            "\n----- EMPLOYEE LIST -----"
        );

        for (int i = 0; i < employees.size(); i++) {

            Employee e = employees.get(i);

            System.out.println(
                (i + 1) +
                ". Name: " + e.name +
                " | Age: " + e.age +
                " | Designation: " + e.designation +
                " | Salary: " + e.salary
            );
        }
    }

    // ================= RAISE SALARY =================

    static void raiseSalary() {

        if (employees.isEmpty()) {

            System.out.println(
                "No employees created yet."
            );

            return;
        }

        System.out.print(
            "Enter name of employee to raise salary: "
        );

        String name = sc.nextLine().trim();

        Employee found = null;

        // Search employee
        for (Employee e : employees) {

            if (e.name.equalsIgnoreCase(name)) {

                found = e;
                break;
            }
        }

        if (found == null) {

            System.out.println(
                "Employee not found."
            );

            return;
        }

        // Percentage validation
        double percent;

        while (true) {

            System.out.print(
                "Enter raise percentage (1-10): "
            );

            try {

                percent = Double.parseDouble(
                    sc.nextLine().trim()
                );

                if (percent >= 1 && percent <= 10) {
                    break;
                }

                System.out.println(
                    "Invalid percentage. " +
                    "Please enter a value between 1 and 10."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid percentage. " +
                    "Please enter numbers only."
                );
            }
        }

        // Calculate new salary
        found.salary =
            found.salary +
            (found.salary * percent / 100);

        System.out.println(
            "New salary of " +
            found.name +
            " is " +
            found.salary
        );
    }

    // ================= EXIT =================

    static void exit() {

        while (true) {

            System.out.print(
                "Are you sure you want to exit? (yes/no): "
            );

            String confirm =
                sc.nextLine().trim().toLowerCase();

            if (confirm.equals("yes")) {

                System.out.println(
                    "Thanking you for using the application"
                );

                System.out.println(
                    "Exiting program. Goodbye!"
                );

                exitProgram = true;

                break;

            } else if (confirm.equals("no")) {

                System.out.println(
                    "Okay, returning to menu."
                );

                break;

            } else {

                System.out.println(
                    "Invalid input. Please enter yes or no."
                );
            }
        }
    }
}