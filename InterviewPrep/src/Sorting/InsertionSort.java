package Sorting;

public class InsertionSort {

	public static int[] sort(int[] a) {
      for(int i=1;i<a.length-1;i++){
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
