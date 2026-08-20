package project_1;
import java.util.Scanner;
public class simple_calculator {
	 public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 System.out.println("Enter number 1");
		 int a=s.nextInt();
		 System.out.println("Enter number 2");
		 int b=s.nextInt();
		 
		 
		 System.out.println("1.Addition ");
		 System.out.println("2.Subraction ");
		 System.out.println("3.Multiplication ");
		 System.out.println("4.Division ");
		 
		 
		 
		 System.out.println("Enter your choice: ");
	        int choice = s.nextInt();
	         {
	        switch(choice) {
	        case 1:
	        	System.out.println("" +(a+b));
	        	break;
	        case 2:
	        	System.out.println("" +(a-b));
	        	break;
	        case 3:
	        	System.out.println("" +(a*b));
	        	break;
	        case 4:
	        	System.out.println("" +(a/b));
	        	break;
	        	
	        }
	        s.close();
	        }
	        
	
	
}
	 
}
