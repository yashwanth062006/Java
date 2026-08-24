package project_1;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s1 = sc.next();

        System.out.print("Enter second word: ");
        String s2 = sc.next();

        char[] a = s1.toCharArray(); // Changes characters to array      //cat> [c,a,t])
        char[] b = s2.toCharArray();

        Arrays.sort(a);             //sorting   [a,c,t]
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
        sc.close();
    }
}