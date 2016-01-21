package Sorting;

import java.util.Arrays;

public class InsertionSort {
   public static void main(String[] args) {
	int [] a={2,1,4,3};
	System.out.println(Arrays.toString(sort(a)));
}

	public static int[] sort(int[] a) {
      for(int i=1;i<a.length;i++){
    	  int val=a[i];
    	  int temp=i;
    	  while(temp>0&&a[temp-1]>val){
    		  a[temp]=a[temp-1];
    		  temp--;
    	  }
    	  a[temp]=val; 
      }
		return a;
	}
	

}
