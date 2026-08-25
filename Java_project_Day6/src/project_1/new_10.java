package project_1;

public class new_10 {

    public static void main(String[] args) {

        String[] array1 = {"Manu", "Yash", "Varun"};
        String[] array2 = {"Kumar", "Yash", "Rohit"};

        String[] merged = new String[array1.length + array2.length];

        int index = 0;

        // Add array1 elements without duplicates
        for (int i = 0; i < array1.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {
                if (array1[i].equals(merged[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                merged[index] = array1[i];
                index++;
            }
        }

        // Add array2 elements without duplicates
        for (int i = 0; i < array2.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {
                if (array2[i].equals(merged[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                merged[index] = array2[i];
                index++;
            }
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < index; i++) {
            System.out.println(merged[i]);
        }
    }
}