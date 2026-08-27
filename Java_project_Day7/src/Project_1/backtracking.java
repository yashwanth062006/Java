package Project_1;

public class backtracking {
	static String correctpassword="99023";
	
	static void trypassword( String password) {
		System.out.println("Trying :"+password);
		
		if(password.equals(correctpassword)) {
	          System.out.println("Password found: " + password);
	            return;
	        }  
		System.out.println("Wrong password. Go back and try another.");
		
		}
	public static void main(String[] args) {
		    trypassword("99024");
	        trypassword("99032");
	        trypassword("89021");
	        trypassword("99024");
	        trypassword("99023");
		
	}
	}


