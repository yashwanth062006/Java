package project_1;

import java.util.Scanner;
public class area_of_circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius");
		double r=sc.nextInt();
		
		double area=Math.PI*r*r;
		System.out.print("Area of circle"+area);
		sc.close();
	}

}
