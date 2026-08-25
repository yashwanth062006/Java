package project_1;

public class pgm_11 {
    public static void main(String[] args) {

        String[] names = {"Manu", "Rohit", "Dhruva"};
        int[] numbers = {10, 20, 30};

        Object[] merged = new Object[names.length + numbers.length];

        for (int i = 0; i < names.length; i++) {
            merged[i] = names[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            merged[names.length + i] = numbers[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}