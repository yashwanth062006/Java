package project_1;

public class Salary_sum {
	 public static void main(String[] args) {
		 
		 int Sum=0;
		 int [] employees= {10000,15000,12000,10000,20000};
		
		 
		 for(int i=0;i<employees.length;i++) {
			 Sum=Sum+employees[i];
		 }
		 System.out.println("Total Salary  "+Sum);

}
}

