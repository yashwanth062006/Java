package project_1;
import java.util.ArrayList;
public class array_list {
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<>();
		
		System.out.println("No of elements in the vector: " + list.size());
		System.out.println("Capacity of the vector: " + list.isEmpty());
		System.out.println("Values stored in vector: " + list);
		
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("F");
		list.add("Y");
		list.add("R");
		list.add("D");
		list.add("R");
		list.add(null);
	
		boolean b1=list.contains("A");
		System.out.println("Value A is present " + b1);
		boolean b2=list.contains("Y");
		System.out.println("Value Y is present " + b2);
		list.remove("C");
		System.out.println("ArraySize after deletion " + list.size());
		System.out.println("Contents of Array List after deletion " + list);
		list.clear();
		System.out.println("ArraySize after clearing " + list.size());
		System.out.println("Contents of Array List after clearing " + list);
	
	
	}


}
