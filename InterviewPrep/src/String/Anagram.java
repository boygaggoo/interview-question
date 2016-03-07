package String;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagramSimple(String str1, String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}
		char [] word1=str1.toCharArray();
		char[] word2=str2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
		
	}

	public static boolean isAnagram(String str1, String str2) {
	    if(str1.length()!=str2.length()){
	    	return false;
	    }
	    StringBuilder str=new StringBuilder(str2);
	    char [] word1=str1.toCharArray();
	    for(char c:word1){
	    	int index=str.indexOf(""+c);
	    	if(index!=-1){
	    		str.deleteCharAt(index);
	    	}
	    	else{
	    		return false;
	    	}
	    }
		return str.length()==0?true:false;
	}

}
