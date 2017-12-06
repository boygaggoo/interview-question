package dec.seventeen;

import java.util.HashSet;

public class MultipleDuplicates {
	public static void main(String[] args) {
		int [] a={1,2,3,3,4,5,6,6,7,7,7,8};
		multipleDuplicates(a);
	}

	private static void multipleDuplicates(int[] a) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:a){
			if(set.contains(i)){
				System.out.println(i);
			}
			else{
				set.add(i);
			}
		}
		
	}

}
