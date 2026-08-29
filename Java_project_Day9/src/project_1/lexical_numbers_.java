package project_1;



	import java.util.*;

	public class lexical_numbers_ {

	    public static void main(String[] args) {

	        String[] numbers = {
	            "9584435963",
	            "9535552368",
	            "998257485",
	            "9581456987",
	            "9741278945",
	            "9902345858"
	        };

	        String search = "95";

	        ArrayList<String> result = new ArrayList<>();

	        for (String number : numbers) {

	            if (number.contains(search)) {
	                result.add(number);
	            }
	        }

	        System.out.println("Search results:");

	        for (String number : result) {
	            System.out.println(number);
	        }
	    }
	

}
