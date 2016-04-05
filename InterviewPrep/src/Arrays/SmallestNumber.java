package Arrays;

public class SmallestNumber {
	/**
	 * Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set. 
Expected time complexity is O(n).
	 */
	public static void main(String[] args) {
		int [] a={1, 3, 6, 10, 11, 15};
		int [] b={2,1,1,1};
				System.out.println(smallestNumber(b));
	}

	private static int smallestNumber(int[] a) {
		// TODO Auto-generated method stub
		int cand=1;
		for(int i=0;i<a.length;i++){
			if(cand<a[i]){
				return cand;
			}
			else{
				cand+=a[i];
			}
		}
		return cand;
	}

}
