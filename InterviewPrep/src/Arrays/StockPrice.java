package Arrays;

import java.util.Arrays;
import java.util.Collections;

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
/**
 * If the array has size 0 or size 1, the maximum profit is 0.
#    Otherwise:
#       Split the array in half.
#       Compute the maximum single-sell profit in the left array, call it L.
#       Compute the maximum single-sell profit in the right array, call it R.
#       Find the minimum of the first half of the array, call it Min
#       Find the maximum of the second half of the array, call it Max
#       Return the maximum of L, R, and Max - Min.
# this algorithm uses O(n log n) time and O(log n) memory.

 * @param a
 * @return
 */
	public static int divideAndConquer(int[] a) {
		if(a.length<=1)
			return 0;
		int []leftArray=Arrays.copyOfRange(a, 0, a.length/2);
		int [] rightArray=Arrays.copyOfRange(a,  a.length/2,a.length);
	    // Find the values for buying and selling purely in the left or purely in
		// the right.
		 int  leftBest  = divideAndConquer(leftArray);
		  int rightBest = divideAndConquer(rightArray);
		int min=findMin(leftArray);
		int max=findMax(rightArray);
		int crossBest=max-min;
		return Math.max(crossBest,Math.max(leftBest, rightBest));
	}
private static int findMax(int[] rightArray) {
	int max=Integer.MIN_VALUE;
	for(int i:rightArray){
		if(i>max){
			max=i;
		}
	}
	return max;
}
private static int findMin(int[] leftArray) {
	int min=Integer.MAX_VALUE;
	for(int i:leftArray){
		if(i<min){
			min=i;
		}
	}
	return min;
}
/**
 * # This gives the following simple and elegant algorithm for the maximum single-
# sell profit problem:
#
#   Let profit = 0.
#   Let min = arr[0]
#   For k = 1 to length(arr):
#       If arr[k] < min, set min = arr[k]
#       If profit < arr[k] - min, set profit = arr[k] - min
#
# This is short, sweet, and uses only O(n) time and O(1) memory.  The beauty of
# this solution is that we are quite naturally led there by thinking about how
# to update our answer to the problem in response to seeing some new element.
 * @param a
 * @return
 */
public static int simpleSolution(int[] a) {
	//[1,10,20,100]
	if(a.length<=1)
		return 0;
	int min=a[0];//1
	int profit=0;//0
	for(int i=1;i<a.length;i++){//10,20,100
		if(a[i]<min){//10,20,100
			min=a[i];
		}
		if(profit<a[i]-min){//9,19,99
			profit=a[i]-min;//9,19,99
		}
	}
	return profit;
}
/**
 * This is short, sweet, and uses only O(n) time and O(1) memory.  The beauty of
# this solution is that we are quite naturally led there by thinking about how
# to update our answer to the problem in response to seeing some new element.
 * This method finds maxProft,index of sell and buy
 * @param b
 * @return
 */
public static int [] simpleSolutionWithIndexes(int[] a) {
	int min=a[0],maxProfit=0;
	int buyDate=0,sellDate=0;
	int [] result={buyDate,sellDate,maxProfit};
	for(int i=1;i<a.length;i++){
		if(a[i]<min){
			min=a[i];
			buyDate=i;
		}
		int profit=a[i]-min;
		if(maxProfit<profit){
			maxProfit=profit;
			sellDate=i;
		}
	}
	result[0]=buyDate;result[1]=sellDate;result[2]=maxProfit;
	return result;
}

}
