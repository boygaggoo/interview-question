package Arrays;

import java.util.ArrayList;
import java.util.List;

public class JoinSortedArrays {
	static List<Integer> result=new ArrayList<Integer>();
	public static void main(String[] args) {
		
	
int []a={10,15,25};
int []b={1,5,20,30};
joinSorted(a,b);
}

	private static void joinSorted(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			result.add(a[i]);
			findAllPairs(a[i],b);
			
		}
		System.out.println(result);
	}

	private static void findAllPairs(int min, int[] b) {
		
		for(int i=0;i<b.length;i++){
			if(b[i]>min){
				result.add(b[i]);
			}
		}
		
	}
}