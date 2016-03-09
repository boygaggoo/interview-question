package Arrays;

import java.util.Arrays;

public class Quicksort {
public static void main(String[] args) {
	int [] a={5,4,2,1,3};
	
	System.out.println(Arrays.toString(quicksort(a)));
}

private static int [] quicksort(int[] a) {
	return sort(a,0,a.length-1);
	
}

private static int[] sort(int[] a, int start, int end) {
	if(start<end){
		int pIndex=partition(a,start,end-1);
		sort(a,start,pIndex-1);
		sort(a, pIndex+1, end);
	}
	return a;
	
}

private static int partition(int[] a, int start, int end) {
	int partion=a[end];
	int pIndex=start;
	for(int i=0;i<end-1;i++){
		if(a[i]<=partion){
			swap(a,i,pIndex);
			pIndex++;
		}
	}
	swap(a,pIndex,end);
	return pIndex;
}

private static void swap(int[] a, int i, int j) {
	int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
	
}
}
