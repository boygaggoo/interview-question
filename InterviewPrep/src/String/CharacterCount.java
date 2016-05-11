package String;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static Map<Character,Integer> findCharCount(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(charMap.containsKey(c)){
			charMap.put(c, charMap.get(c)+1);
			}
			else{
				charMap.put(c,1);
			}
		}
		return charMap;
	}

}
