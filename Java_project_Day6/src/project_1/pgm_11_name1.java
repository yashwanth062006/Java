package project_1;

public class pgm_11_name1 {

    public static void main(String[] args) {


        String[] array1 = {"Manu", "Yash", "Varun"};
        String[] array2 = {"Kumar", "Yash", "Rohit"};

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