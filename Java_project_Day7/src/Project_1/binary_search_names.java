package Project_1;


public class binary_search_names {

	    public static int binarySearch(String[] arr, String target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            System.out.println("Checking: " + arr[mid]);

	            if (arr[mid] == target) {
	                return mid;
	            } else if (target.compareTo(arr[mid]) > 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; // Not found
	    }

	    public static void main(String[] args) {
	        String[] names = {"Yashwanth","Rohith","Madhu","Kumar","Dhruva","Shashi"};
	        String target = "Madhu";

	        int result = binarySearch(names, target);

	        if (result != -1) {
	            System.out.println("Name Found at " + result);
	        } else {
	            System.out.println("Name Not Found");
	        }
	    }
	}

