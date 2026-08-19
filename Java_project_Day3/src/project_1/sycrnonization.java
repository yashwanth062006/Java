package project_1;

class Bank {
	synchronized void withdraw(int amount) {  //synchronization_function
		System.out.println("Withdrawing " + amount);
		try {                         //exception_handling
			Thread.sleep(4000);    //wait for 4sec after withdraw
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Withdraw to completed");
	}
}
class MyThread extends Thread{//Thread_concept
	Bank bank;
	  MyThread(Bank bank) {
	        this.bank = bank;
	    }
	    public void run() {
	        bank.withdraw(500);
	    }
	}
public class sycrnonization {
    public static void main(String[] args) {
        Bank bank = new Bank();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
    }
}






