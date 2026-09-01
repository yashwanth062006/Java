package Project_1;

import java.util.*;

public class priority_tasks {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 8, 15, 30, 25};

        // 1. Largest 3 numbers
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int number : numbers) {

            minHeap.add(number);

            if (minHeap.size() > 3) {
                minHeap.poll();
            }
        }

        System.out.println("Largest 3 numbers:");

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }


        // 2. Maximum
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int number : numbers) {
            maxHeap.add(number);
        }

        System.out.println("Maximum = " + maxHeap.peek());


        // 3. Minimum
        PriorityQueue<Integer> min =
                new PriorityQueue<>();

        for (int number : numbers) {
            min.add(number);
        }

        System.out.println("Minimum = " + min.peek());


        // 4. Median
        Arrays.sort(numbers);

        double median;

        if (numbers.length % 2 == 0) {

            median = (numbers[numbers.length / 2 - 1]
                    + numbers[numbers.length / 2]) / 2.0;

        } else {

            median = numbers[numbers.length / 2];
        }

        System.out.println("Median = " + median);
    }
}