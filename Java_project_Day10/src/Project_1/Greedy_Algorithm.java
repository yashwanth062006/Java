package Project_1;

public class Greedy_Algorithm {
	public static void main(String[] args) {
		
		int[]coins= {20,10,5,2,1};
		int amount=41;
		
		int count =0;
		
		for (int coin:coins) {
			while (amount>=coin) {
				amount=amount-coin;
				count++;
				
				System.out.println("Coin:"+coin);
				
			}			
		}
		System.out.println("Minimun coins="+count);

		
	}

}
