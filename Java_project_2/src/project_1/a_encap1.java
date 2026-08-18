package project_1;

public class a_encap1 {
	
		int a = 20;
		int b = 10;

		void m1(int c,int d) {
			System.out.println("Encapsulation"+(a+b));
		System.out.println("Data"+(c+d));
		}

		public static void main(String[] args) {
			a_encap1  vv = new a_encap1();
			vv.m1(4,3);
		}
	}


