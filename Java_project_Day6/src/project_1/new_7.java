package project_1;

public class new_7 {
	    public static void main(String[] args) {

	        int[] profit = {10, 20, 30, 5, 15};

	        int currentProfit = profit[0] + profit[1] + profit[2];    
	        int bestProfit = currentProfit;

	        for (int i = 3; i < profit.length; i++) {

	            currentProfit = currentProfit
	                    - profit[i - 3]
	                    + profit[i];

	            if (currentProfit > bestProfit) {
	                bestProfit = currentProfit;
	            }
	        }

	        System.out.println("Highest Profit = " + bestProfit);
	    }
	}


