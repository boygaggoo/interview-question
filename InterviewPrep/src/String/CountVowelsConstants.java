package String;

import java.util.regex.Pattern;

public class CountVowelsConstants {

	public static String count(String str) {
		int vowelCount=0,constantCount=0;
		for(Character c:str.toCharArray()){
			if(Pattern.matches("[aeiou]", Character.toString(c))){
				vowelCount++;
			}else{
				constantCount++;
			}
		}
		return vowelCount+","+constantCount;
	}
   
}
