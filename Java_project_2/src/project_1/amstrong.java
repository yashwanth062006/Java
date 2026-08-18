package project_1;

public class amstrong {
	

	    public static void main(String[] args) {
	    	int n=153;
	    	int temp=n;
	    	int sum=0;
	    	while(n>0) {
	    		int o=n%10;
	    		 sum= sum+(o*o*o);
	    		 n=n/10;
	    	}
	    		 if (sum == temp) {
	    	            System.out.println("Armstrong number");
	    	        } else {
	    	            System.out.println("Not an Armstrong number");
	    	        }
	    	}
	    }

	    	
	    	
	    	
	    	
	    	
	    	
	    

	     

