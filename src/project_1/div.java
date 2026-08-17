package project_1;
import java.util.Scanner;
public class div {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter first number: ");
		int a =sc.nextInt();
		System.out.print("Enter Second number: ");
	    int b =sc.nextInt();
		int div= a/b;
		System.out.print("Division"+div);
		sc.close();
	}
}