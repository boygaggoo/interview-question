package Arrays;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int a[]={1,2,3,4};
	System.out.println(Arrays.toString(reverse(a)));
}

private static int[] reverse(int[] a) {
	int j=a.length-1;
	for(int i=0;i<a.length/2;i++){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		j--;
	}
	return a;
}
}
