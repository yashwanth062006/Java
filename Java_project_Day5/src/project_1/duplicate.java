package project_1;

public class duplicate {
	public static void main(String[] args) {
		
		String s1="PROGRAMMING";
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				

                if (s1.charAt(i) == s1.charAt(j)) {
                    System.out.println("Duplicate: " + s1.charAt(i));
                    break;
				
                }
			}
			
		}
	}

}
