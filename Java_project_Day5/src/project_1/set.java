package project_1;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        // Add 10 values
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        // Duplicate values
        numbers.add(20);
        numbers.add(50);

        // Remove elements
        numbers.remove(30);
        numbers.remove(70);

        // Iterate
        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}