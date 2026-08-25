package project_1;

public class student_marks_1 {


	    public static void main(String[] args) {

	    	        int[] marks = {50, 60, -20, 70, -10, 80, 40};

	    	        int currentMarks = 0;
	    	        int bestMarks = 0;
	    	        int highestMarks = marks[0];

	    	        // Maximum continuous marks
	    	        for (int i = 0; i < marks.length; i++) {

	    	            currentMarks = currentMarks + marks[i];

	    	            if (currentMarks < 0) {
	    	                currentMarks = 0;
	    	            }

	    	            if (currentMarks > bestMarks) {
	    	                bestMarks = currentMarks;
	    	            }
	    	        }

	    	        // Highest individual marks
	    	        for (int i = 1; i < marks.length; i++) {

	    	            if (marks[i] > highestMarks) {
	    	                highestMarks = marks[i];
	    	            }
	    	        }

	    	        System.out.println("Best Continuous Marks = " + bestMarks);
	    	        System.out.println("Highest Marks = " + highestMarks);
	    	    }
	    	}
