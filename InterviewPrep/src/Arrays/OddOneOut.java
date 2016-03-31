package Arrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import map.Entry;

public class OddOneOut {

	public static int find(int[] arr) {
		Hashtable<Integer, Integer> ht=new Hashtable<>();
		for(int i:arr){
			if(ht.containsKey(i)){
				ht.put(i, ht.get(i)+1);
			}
			else{
				ht.put(i,1);
			}
		}
		Set<java.util.Map.Entry<Integer, Integer>> entrySet=ht.entrySet();
		for(java.util.Map.Entry<Integer, Integer> rt:entrySet){
			if(rt.getValue()==1){
				return rt.getKey();
			}
			
		}
		return -1;
		
	}

}
