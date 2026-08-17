package project_1;

import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of rectangle = " + area);

        sc.close();
    }
}