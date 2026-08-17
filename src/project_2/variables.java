package project_2;


public class variables { //class
	int a=5;//instance
	static int cc=99;//static
	void m1(){ //method
		int a=10;//local
		System.out.println("local_variable"+a);
	}
	public variables() {  //constructor
		int b=20;
		System.out.println("constructor_variable"+b);
	}
	public static void main(String[] args) {
		variables v=new variables();//object
		v.m1();
		System.out.println("variables"+v.a);//printing_instance_output
		System.out.println(cc);//printing_static_output
		System.out.println(variables.cc);//printing_static_output_withclassname
	}

}