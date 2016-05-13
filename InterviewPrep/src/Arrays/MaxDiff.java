package Arrays;
/**
 * Given an array find the maxDiff between array
 * @author Siddiq Ahmed Syed
 *
 */
public class MaxDiff {


public static int diff(int[] a) {
	int maxDiff=0;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++){
		if(a[i]<min){
			min=a[i];
		}
		int diff=a[i]-min;
		if(diff>maxDiff){
			maxDiff=diff;
		}
	}
	return maxDiff;
}
}
