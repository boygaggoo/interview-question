package Arrays;
/**
 * Given an array find the maxDiff between array
 * @author Siddiq Ahmed Syed
 *
 */
public class MaxDiff {


public static int diff(int[] a) {
	int maxDiff=0;
	int min=Integer.MAX_VALUE;//1,4,0
	for(int i=0;i<a.length;i++){
		if(a[i]<min){
			min=a[i];//0
		}
		int diff=a[i]-min;
		if(diff>maxDiff){
			maxDiff=diff;
		}
	}
	return maxDiff;
}

public static int profit(int[] a) {
	int i=0;
	int j=a.length;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	int minIndex=0;
	int MaxIndex=0;
	while(i<j){
		if(a[i]<min){
			min=a[i];
			minIndex=i;
		}
		if(a[i]>max){
			max=a[i];
			MaxIndex=i;
		}
		i++;
	}
	System.out.println(minIndex+","+MaxIndex);
	return max-min;
}

}
