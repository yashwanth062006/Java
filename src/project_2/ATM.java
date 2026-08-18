package project_2;
import java.util.Scanner;

public class ATM{

    String name;
    int age;
    String designation;

    void create() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter designation (Tester/Developer/Manager): ");
        designation = sc.nextLine();

        System.out.println("Employee created successfully!");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        ATM a = new ATM();
        try (Scanner sc = new Scanner(System.in)) {
			int choice;

			do {
			    System.out.println("\n1. Create");
			    System.out.println("2. Display");
			    System.out.println("3. Exit");

			    System.out.print("Enter choice: ");
			    choice = sc.nextInt();

			    switch (choice) {

			        case 1:
			            a.create();
			            break;

			        case 2:
			            a.display();
			            break;

			        case 3:
			            System.out.println("Thank you!");
			            break;

			        default:
			            System.out.println("Invalid choice");
			    }

			} while (choice != 3);
		}
    }
}