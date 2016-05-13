package String;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import map.Entry;

public class HighestOccuredChar {
public static void main(String[] args) {
	System.out.println(findHighestChar("aaaaaaaaaaaaaaaaabbbbcddddeeeeee"));
}

private static char findHighestChar(String str) {
	// TODO Auto-generated method stub
	char max='a';
	int count=Integer.MIN_VALUE;
	HashMap<Character,Integer> charMap=new HashMap<>();
	for(Character c:str.toCharArray()){
		if(charMap.containsKey(c)){
			charMap.put(c, charMap.get(c)+1);
		}
		else{
			charMap.put(c, 1);
		}
	}
	for(java.util.Map.Entry<Character, Integer> entry:charMap.entrySet()){
		if(entry.getValue()>count){
			max=entry.getKey();
			count=entry.getValue();
		}
	}
	return max;
}
}
