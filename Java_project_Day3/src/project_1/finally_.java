package project_1;

public class finally_ {
	public static void main(String[] args) {
		System.out.println("Yashwanth");
		System.out.println("Rohit");
		//int a=10/0; not_executes_teminates_here
		try {
			int b=5/0;
			System.out.println("Manu");
		}catch (ArithmeticException e) {           //which_exception_arthimetic
			System.out.println(" arthimatic handle");
		}finally {
			System.out.println("Finally_block");
		}
		System.out.println("Rest of code");
	}
	

}
