package Arrays;

import java.util.Arrays;

public class kthSmallestElem {
public static void main(String[] args) {
	int [] a={1,4,5,2,4,7,10};
	System.out.println(findKSmall(a,2));
}

private static int findKSmall(int[] a, int i) {
 Arrays.sort(a);
 return a[i-1];
	
}
}
