package project_1;
import java.util.Scanner;
public class multi {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter first number: ");
		int a =sc.nextInt();
		System.out.print("Enter Second number: ");
	    int b =sc.nextInt();
		int mul= a+b;
		System.out.print("Multiplication "+mul);
		sc.close();
	}
}