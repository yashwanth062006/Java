package project_1;

public class inmutable {
	public static void main(String[] args) {
		
		String s1="Hello"; //cannot change
		String s2=s1;      //s1=s2
		s1=s1+" World";   // Immutability
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}

}
