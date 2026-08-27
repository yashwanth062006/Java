package Project_1;

public class stack_visualization {
	    static void methodA() {
	        System.out.println("Inside methodA");  //print 2 and then go to method B
	        methodB();
	        System.out.println("Back to methodA"); //print 4
	    }

	    static void methodB() {
	        System.out.println("Inside methodB"); //print 3 and then go to methodA
	    }

	    public static void main(String[] args) {
	        System.out.println("Inside main");  //print 1 and then go to methodA
	        methodA();
	        System.out.println("Back to main"); //print 5
	    }
	}

