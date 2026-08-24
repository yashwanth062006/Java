package project_1;

import java.util.Scanner;

public class simple_palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true){

        System.out.print("Enter a word: ");
        String s = sc.next();

        boolean palindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
       
        sc.close();
  
    }
    }    
        
}