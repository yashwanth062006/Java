package project_1;

public class multithreading extends Thread { //thread_extends
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Method"+i);  //Task_1
		}
	}
	public static void main(String[] args) {
	multithreading m=new multithreading();
	m.start();                             //performing_multithreading
	
	for (int i = 0; i < 5; i++) {
		System.out.println("Main method"+i);  //Task_2
	}
	
	}
}
