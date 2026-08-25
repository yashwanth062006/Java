package project_1;

public class pgm_11_intersection {

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30};
        int[] array2 = {30, 10, 60};

        System.out.println("Intersection:");

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }

            }
        }
    }
}
