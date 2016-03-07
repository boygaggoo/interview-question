package String;

import java.util.Hashtable;

public class FirstNonRepeatedChar {

	public static Character find(String word) {
		Hashtable<Character, Integer> charMap=new Hashtable<>();
		for(int i=0;i<word.length();i++){
			char c=word.charAt(i);
			if(charMap.containsKey(word.charAt(i))){
				charMap.put(c,charMap.get(c)+1);
			}
			else{
				charMap.put(c,1);
			}
		}
		for(Character c:charMap.keySet()){
			if(charMap.get(c)==1){
				return c;
			}
		}
		return null;
		
	}

}
