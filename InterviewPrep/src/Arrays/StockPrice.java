package Arrays;

/**
 * The cost of a stock on each day is given in an array, 
 * find the max profit that you can make by buying and selling in those days. 
 * For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
 *  the maximum profit can earned by buying on day 0, selling on day 3. 
 *  Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, 
 *  then profit cannot be earned at all.
 */
	
public class StockPrice {
	/**
	 * This is the brute force way of finiding the maxProfit
	 * Complexity O(n^2)
	 * @param a
	 */
	public static int bruteForce(int[] a) {
		int profit=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				profit=Math.max(profit, a[j]-a[i]);
			}
		}
		return profit;
	}

}
