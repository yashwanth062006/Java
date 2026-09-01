
	package Project_1;

	import java.util.*;

	public class pq_median {

	    public static void main(String[] args) {

	        int[] numbers = {30, 10, 20, 5,};

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


