package hackerrank.challenge.crackingthecoding;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		System.out.println(Arrays.toString(arrayLeftRotation(a, 5, 4)));
	}
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
		 int [] temp=new int[n];
		
		 int j=0;
		 for(int i=k;i<n;i++){
			temp[j]=a[i];
			j++;
		 }
		 for(int i=0;i<k;i++){
			 temp[j]=a[i];
			 j++;
		 }
	      return temp;
	    }
}
