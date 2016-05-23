package String;
/**
 * The sentence "A quick brown fox jumps over the lazy dog" contains every single letter in the 
alphabet. Such sentences are called pangrams. You are to write a method getMissingLetters, 
which takes a String, sentence, and returns all the letters it is missing (which prevent it from 
being a pangram). You should ignore the case of the letters in the sentence, and your return 
should be all lower case letters, in alphabetical order. You should also ignore all non US-ASCII 
characters.
 * @author Siddiq Ahmed Syed
 *
 */
public class Panagram {

	public static String getMissingLetters(String str) {
		StringBuilder alphabets=new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		char [] strArray=str.toLowerCase().toCharArray();
		for(char c:strArray){
			int index=alphabets.indexOf(c+"");
			if(index!=-1){
				alphabets.deleteCharAt(index);
			}
		}
		return alphabets.toString();
		
	}

}
