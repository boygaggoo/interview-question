package Recursion;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		reverseArray(a);
		System.out.println(Arrays.toString(a));
	}

	private static void reverseArray(int[] a) {
		reverseArray(a,0,a.length-1);
		
	}

	private static void reverseArray(int[] a, int start, int end) {
		if(start>=end){
			return;
		}
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		reverseArray(a,start+1,end-1);
		
	}

}
