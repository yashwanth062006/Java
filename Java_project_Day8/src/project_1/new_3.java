package project_1;
import java.util.Stack;
public class new_3 {
	

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	        // Push elements
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Stack: " + stack);

	        // See top element
	        System.out.println("Top element: " + stack.peek());

	        // Remove top element
	        System.out.println("Removed: " + stack.pop());
	        System.out.println("Stack after pop: " + stack);

	        // Check whether stack is empty
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
	}

