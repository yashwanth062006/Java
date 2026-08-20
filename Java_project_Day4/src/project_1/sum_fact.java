package project_1;

import java.util.Scanner;
public class sum_fact {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a =sc.nextInt();	
		
		int b=0;
		for (int i=1;i<=a;i++) {
			b=b+i;
		}
		System.out.print("Sum "+b);
		sc.close();
	}

}