package project_2;

import java.util.Scanner;

public class ATM {

    String name;
    int age;
    String designation;
    double salary;

    void create() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        if (age < 18 || age > 60) {
            System.out.println("Invalid age!");
            return;
        }

        while (true) {
            System.out.print("Enter designation: ");
            designation = sc.nextLine();

            if (designation.equals("Tester") ||
                designation.equals("Developer") ||
                designation.equals("Manager")) {
                break;
            }

            System.out.println("Invalid designation!");
        }

        if (designation.equals("Tester")) {
            salary = 30000;
        }
        else if (designation.equals("Developer")) {
            salary = 40000;
        }
        else {
            salary = 50000;
        }

        System.out.println("Employee created successfully!");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    void raiseSalary() {
        salary = salary + 5000;
        System.out.println("New Salary: " + salary);
    }

    public static void main(String[] args) {

        ATM a = new ATM();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    a.create();
                    break;

                case 2:
                    a.display();
                    break;

                case 3:
                    a.raiseSalary();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}