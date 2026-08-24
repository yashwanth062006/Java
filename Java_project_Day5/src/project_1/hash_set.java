package project_1;

import java.util.HashSet;

public class hash_set {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		//printing values before Initialization
		System.out.println("Intial size of Hashset before adding value"+set.size());
	    System.out.println("Hash set is empty before adding values"+set.isEmpty());
	    System.out.println("Contents of Hashset"+set);
	    //Adding elements
	    
	    set.add("C");
	    set.add("A");
	    set.add("D");
	    set.add("E");
	    set.add("F");
	    // display the  HashSet
	    System.out.println("Set size of Hashset after adding value"+set.size());
	    System.out.println("Hash set is empty after adding values"+set.isEmpty());
	    set.add("F");
	 // cannot add duplicate values in HashSet
	 // set.add("A");
	 // can add null values in HashSet
	 set.add(null);
	 System.out.println("Size of HashSet after adding elements: " + set.size());
	 System.out.println("HashSet is empty after adding values: " + set.isEmpty());
	 // display the contents of HashSet
	 System.out.println("Contents of HashSet after adding values: " + set);
	 // check whether an element is present or not
	 boolean b1 = set.contains("E");
	 System.out.println("Value E is present: " + b1);
	 boolean b2 = set.contains("R");
	 System.out.println("Value R is present: " + b2);
	 // Remove an element from the HashSet
	 set.remove("B");
	 System.out.println("Size of HashSet after deletion: " + set.size());
	 System.out.println("Contents of HashSet after deletion: " + set);
	 // delete all the elements in the HashSet
	 set.clear();
	 System.out.println("Size of HashSet after clearing: " + set);
}
	
	
	
	
}