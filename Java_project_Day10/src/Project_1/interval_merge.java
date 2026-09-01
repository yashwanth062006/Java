	package Project_1;

	import java.util.*;

	public class interval_merge {

	    public static void main(String[] args) {

	        char[] activity = {'A', 'B', 'C', 'D', 'E'};

	        int[] start = {900, 930, 1000, 1100, 1130};
	        int[] end = {1000, 1100, 1100, 1200, 1300};

	        // Sort according to start time
	        for (int i = 0; i < start.length - 1; i++) {

	            for (int j = i + 1; j < start.length; j++) {

	                if (start[i] > start[j]) {

	                    int temp = start[i];
	                    start[i] = start[j];
	                    start[j] = temp;

	                    temp = end[i];
	                    end[i] = end[j];
	                    end[j] = temp;

	                    char c = activity[i];
	                    activity[i] = activity[j];
	                    activity[j] = c;
	                }
	            }
	        }

	        int currentStart = start[0];
	        int currentEnd = end[0];

	        System.out.println("Merged Intervals:");

	        for (int i = 1; i < start.length; i++) {

	            if (start[i] <= currentEnd) {

	                currentEnd = Math.max(currentEnd, end[i]);

	            } else {

	                System.out.println(currentStart + " - " + currentEnd);

	                currentStart = start[i];
	                currentEnd = end[i];
	            }
	        }

	        System.out.println(currentStart + " - " + currentEnd);
	    }
	}


