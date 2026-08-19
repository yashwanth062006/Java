package project_1;

public class wrapper {
	public static void main(String[] args) {
		int a=10;
		Integer b=a;             // primitive → wrapper
		System.out.println(b);
		
		int c=b;             // wrapper → primitive
		System.out.println(c);
	}

}
