package dec.seventeen;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] a ={1,2,3,3,4,5,5,6,7,7,7,8,8,9};
		System.out.println(Arrays.toString(removeDuplicates(a)));

	}

	private static int[] removeDuplicates(int[] a) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			if(set.contains(a[i])){
				a[i]=0;
			}else{
				set.add(a[i]);
			}
		}
		return a;
		
	}
	

}
