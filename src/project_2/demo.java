package project_2;
public class demo {       //class
	void d1() { // method (constructors)
		System.out.println("First Java Project");
	}
	
	public demo() { //default constructor
		System.out.println("Constructor");
	}
	public abstract class abstractt {   //abstract class
	abstract void add();  //abstract( does not contain body)
	}
	public static void main(String[] args) {  
		
		demo db=new demo(); // object
		db.d1(); //calling method constructor
	}

}
