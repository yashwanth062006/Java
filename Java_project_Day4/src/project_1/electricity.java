package project_1;

public class electricity {
	public static void main(String[] args) {
	    int Sum=0;
	    int []units= {10,12,15,20,18,16,14};
	    
	    for(int i=0;i<units.length;i++) {
			 Sum=Sum+units[i];
		 }
		 System.out.println("Total Electricity Consumption  "+Sum);
		
	}

}
