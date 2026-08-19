package project_1;
import java.util.Scanner;
public class throw_ {


	static void validate(int age) {
		if (age < 18) {
		
			throw new ArithmeticException("not elgible for vote");
		} else {
			System.out.println("welcome to the voting");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your age ");
		int n = s.nextInt();
		validate(n);
		System.out.println("rest of the code");
		s.close();
	}
}

