package Arrays;

import java.util.Arrays;
/***
 * Given an array of distinct elements, rearrange the elements 
 * of array in zig-zag fashion in O(n) time. 
 * The converted array should be in form a < b > c < d > e < f
 * @author Siddiq Ahmed Syed
 *
 */
public class ZigZagArray {
   public static void main(String[] args) {
	   int[] a={3,9,5,6,2,3};
	System.out.println(Arrays.toString(zigzag(a)));
}

private static int[] zigzag(int[] input) {
	int flag = 0;
	for(int i=1;i<input.length;i++){
		if(flag == 0){
			if(input[i] < input[i-1]){
				int temp = input[i];
				input[i] = input[i-1];
				input[i-1] = temp;
			}
		}
		else{
			if(input[i] > input[i-1]){
				int temp = input[i];
				input[i] = input[i-1];
				input[i-1] = temp;
			
		}
		}
		flag = 1-flag;
	
	}
	return input;
}
}
