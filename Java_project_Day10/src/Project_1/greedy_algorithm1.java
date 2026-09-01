package Project_1;

public class greedy_algorithm1 {

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 5, 6};
        int[] end = {3, 4, 5, 7, 8};

        // First activity is selected
        int lastEnd = end[0];
        System.out.println("Selected Activity: A");

        // Check remaining activities
        for (int i = 1; i < start.length; i++) {

            // Activity can be selected if it starts
            // after the previous activity finishes
            if (start[i] >= lastEnd) {
                System.out.println("Selected Activity: "
                        + (char) ('A' + i));

                lastEnd = end[i];
            }
        }
    }
}