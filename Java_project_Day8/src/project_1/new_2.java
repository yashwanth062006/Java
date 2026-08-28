package project_1;
import java.util.Scanner;
public class new_2 {

	    String name;
	    int salary;
	    
	    
	    new_2(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	    void display() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	        public static void main(String[] args) {

	            Scanner sc = new Scanner(System.in);

	            System.out.print("Enter Employee Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Salary: ");
	            int salary = sc.nextInt();
	            
	            new_2 e = new new_2(name, salary);
	            
	            e.display();
	            sc.close();

	    
          }
	        }
