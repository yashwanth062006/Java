package project_1;

public class student_marks {
	public static void main(String[] args) {
		int[]marks= {50,40,30,70,85};
		int target=80;
		int left=0;
		int right=marks.length-1;
		while(left<right) {
			int sum=marks[left]+marks[right];
			if(sum==target) {
				System.out.println("Marks of student to get 80 is "+marks[left]+" and "+marks[right]);
				break;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		
		
	}
		
		
		
	

}
