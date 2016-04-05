package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreaterSum {
/**
 * Given an array of integers and a number x, 
 * find the smallest subarray with sum greater than the given value
 */
	public static void main(String[] args) {
		int a[]={1, 4, 45, 6, 10, 19};
		int [] b={1, 4, 45, 6, 0, 19};
		System.out.println(findSum(a,9));
//		findSum(b, 53);
	}

private static int findSum(int[] a, int sum) {
	List<Integer> result=new ArrayList<Integer>();
	int len=1;
	for(int i=0;i<a.length;i++){
		int curr_sum=a[i];
		if(curr_sum>sum){
			result.add(curr_sum);
			return 1;
		}
		for(int j=i+1;j<a.length;j++){
			curr_sum+=a[j];
			if(curr_sum>sum&&(a.length-j+1)<len){
				len=a.length-j+1;
				result.add(a[j]);
			}
		}
	}
	return len;
	
}
}
