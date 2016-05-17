package Arrays;

import java.util.HashSet;
import java.util.LinkedHashMap;

import map.Entry;

/**
 * Given an array of integers, find the first repeating element in it. 
 * We need to find the element that occurs more than once and 
 * whose index of the first occurrence is smallest.


 * @author Siddiq Ahmed Syed
 *
 */
public class RepeatingElement {
      public static void main(String[] args) {
    	 int input [] = {10, 5, 3, 4, 3, 5, 6};
    	 findRepeatingElem(input);

    	  
	}

	private static void findRepeatingElem(int[] inp) {
	    HashSet<Integer> hs=new HashSet<Integer>();
	    LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
      for(int i=0;i<inp.length;i++){
			if(map.containsKey(inp[i])){
				map.put(inp[i], map.get(inp[i])+1);
				
			}
			else{
				map.put(inp[i],1);
			}
		}
		for(java.util.Map.Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
				return;
			}
		}
	}
}
