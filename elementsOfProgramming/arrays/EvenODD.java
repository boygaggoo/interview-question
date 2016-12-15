package arrays;

import java.util.Arrays;

/**
 * Your input is an array of integers, and you have to reorder its entries so that the even entries appear first. 
 * This is easy if you use O(n) space, where n is the length of the array. However, you are required to 
 * solve it without allocating additional storage.
 * @author sidsyed
 *
 */
public class EvenODD {
public static void main(String[] args) {
	int [] a={2,3,4,11,17,9,1,20,};
	System.out.println(Arrays.asList(a));
	System.out.println(Arrays.asList(reorder(a)));
}

private static int [] reorder(int[] a) {
	int evenOcc=0;int oddOcc=a.length-1;
	while(evenOcc<oddOcc){
		if(a[evenOcc]%2==0){
			evenOcc++;
		}else{
			int temp=a[evenOcc];
			a[evenOcc]=a[oddOcc];
			a[oddOcc]=temp;
			oddOcc++;
		}
	}
	return a;
	
}
}
