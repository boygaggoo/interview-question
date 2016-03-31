package Sorting;

import java.util.Arrays;

public class InsertionSort {
   public static void main(String[] args) {
	int [] a={2,1,4,3};
//	System.out.println(Arrays.toString(sort(a)));
	System.out.println(Arrays.toString(sort2(a)));
//	System.out.println(Arrays.toString(sort3(a)));//decreasing order
}

	private static int[] sort3(int[] a) {
	for(int j=1;j<a.length;j++){
		int temp=a[j];
		int i=j-1;
		while(i>0 && temp>a[i]){
			a[i+1]=a[i];
			i--;
		}
		a[i+1]=temp;
	}
	return a;
}

	private static int[] sort2(int[] a) {
	// TODO Auto-generated method stub
		for(int j=1;j<a.length;j++){
			int key=a[j];
			int i=j-1;
			while(i>0&&a[i]<key){
				a[i+1]=a[i];
				i-=1;
			}
			a[i+1]=key;
		}
	return a;
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
