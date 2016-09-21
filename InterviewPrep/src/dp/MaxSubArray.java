package dp;

public class MaxSubArray {
	public static void main(String[] args) {
		int []a={1,2,3,0,-1,-2,3};
		System.out.println(maxSubArray(a));
		
	}

	private static int maxSubArray(int[] a) {
		int maxSum=a[0];
		int newmaxSum=a[0];
		for(int i=1;i<a.length;i++){
			newmaxSum=Math.max(newmaxSum+a[i],newmaxSum );
			maxSum=Math.max(newmaxSum, maxSum);
		}
		return maxSum;
	}

}
