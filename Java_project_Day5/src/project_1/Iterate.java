package project_1;

import java.util.HashSet;

public class Iterate {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Add 10 values
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(100);

        // Duplicate values
        set.add(20);
        set.add(50);

        // Remove elements
        set.remove(30);
        set.remove(70);

        // Iterate at last
        for (Integer n : set) {
            System.out.println(n);
        }
    }
}
