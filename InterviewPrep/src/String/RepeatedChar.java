package String;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import map.HashMap;

public class RepeatedChar {

	public static void find(String str) {
		TreeMap<Character,Integer> charMap= new TreeMap<Character,Integer>();
		
		char [] characters=str.toCharArray();
		for(char c:characters){
			
			if(charMap.containsKey(c)){
				
			charMap.put(c, charMap.get(c)+1);
			}
			else{
				charMap.put(c, 1);
				
			}
		}
		Set <Map.Entry<Character, Integer>> entrySet=charMap.entrySet();
		for( Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				
			System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
		
		
	}

	

}
