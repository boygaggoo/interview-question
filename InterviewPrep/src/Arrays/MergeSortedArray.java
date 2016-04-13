package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
public static void main(String[] args) {
	int [] a={4,5,6,9};
	int [] b={1,2,3,8};
	System.out.println(Arrays.toString(merge(a,b)));
}

private static int[] merge(int[] a, int[] b) {
	int aLen=a.length,bLen=b.length,i=0,j=0,k=0;
	int [] result=new int[aLen+bLen];
	
	while(i<aLen&&j<bLen){
		if(a[i]<b[j]){
			result[k]=a[i];
			i++;
		
			
			
		}
		else {
			result[k]=b[j];
			j++;
			
		}
		k++;
	}
	while(i<aLen){
		result[k]=a[i];
		i++;
		k++;
	}
	while(j<bLen){
		result[k]=b[j];
		j++;
		k++;
	}
	
	return result;
}
}
