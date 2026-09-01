
	package Project_1;

	import java.util.*;

	public class pq_max {

	    public static void main(String[] args) {

	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	        maxHeap.add(30);
	        maxHeap.add(10);
	        maxHeap.add(20);
	        maxHeap.add(5);

	        System.out.println("Max Heap: " + maxHeap);

	        System.out.println("Largest element: " + maxHeap.peek());
	    }
	}