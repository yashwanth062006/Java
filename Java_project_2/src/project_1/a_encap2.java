package project_1;

public class a_encap2 {
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		a_encap2 vv = new a_encap2();
		vv.m1(4, 3);
		vv.m2();
	}
}