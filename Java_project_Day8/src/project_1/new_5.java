package project_1;
import java.util.LinkedList;
import java.util.Queue;
public class new_5 {
	    public static void main(String[] args) {
	        int[] arr = {4, 10, 5, 2, 9, 7, 3};
	        int k = 3;

	        Queue<Integer> queue = new LinkedList<>();

	        for (int i = 0; i < arr.length; i++) {
	            queue.add(arr[i]);   // add current element into the window

	            // if window exceeds size k, remove the oldest element
	            if (queue.size() > k) {
	                queue.remove();
	            }

	            // once window has k elements, find and display the max
	            if (queue.size() == k) {
	                int max = findMax(queue);
	                System.out.println("Window: " + queue + " -> Max: " + max);
	            }
	        }
	    }

	    static int findMax(Queue<Integer> queue) {
	        int max = Integer.MIN_VALUE;
	        for (int num : queue) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }
	}


