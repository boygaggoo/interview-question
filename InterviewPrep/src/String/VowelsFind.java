package String;

public class VowelsFind {

	public static int find(String str) {
		String vowels="aeiou";
		int count=0;
		for(Character c:str.toCharArray()){
			if(vowels.contains(c+"")){
				count++;
			}
		}
		return count;
	}
   
}
