package project_1;
import java.util.Scanner;
public class week {
	public static void main(String[] args) {
System.out.println("There are 7 Days in a week ");
	Scanner s =new Scanner(System.in);
	while(true) {
	
	System.out.println("Enter a Number ");
    int a=s.nextInt();
     {
    switch(a) {
    case 1:
    	System.out.println("Sunday");
    	break;
    case 2:
    	System.out.println("Monday");
    	break;
    case 3:
    	System.out.println("Tuesday");
    	break;
    case 4:
    	System.out.println("Wednesday");
    	break;
    case 5:
    	System.out.println("Thrusday");
    	break;
    case 6:
    	System.out.println("Friday");
    	break;
    case 7:
    	System.out.println("Saturday");
    	break;
    }
    s.close();
    }

	}
}
}
