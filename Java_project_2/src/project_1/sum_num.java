package project_1;
import java.util.Scanner;
public class sum_num {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }


}
