package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
	public static void main(String[] args) {
	
  HashSet<Integer> hs=new HashSet<>();
  int [] a={1,2,2,3,4,3,2,1,5,6,6,7};
  ArrayList<Integer> duplicates=new ArrayList<Integer>();
  for(int i:a){
	  if(hs.contains(i)){
		  duplicates.add(i);
	  }
	  else{
		  hs.add(i);
	  }
  }
  System.out.println(duplicates);
}
}
