package coding.interview.chap1;
/**
 * The task is to compress the String. For example if the input String is aabbbc 
 * the output should be a2b3c1
 * @author Siddiq Ahmed Syed
 *
 */

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compressString("aabbbc"));
	}
	
	/** 
	 * This method takes a string and converts into character Array
	 * then it compares each character of the string with the rest of the characters
	 * in the String and if the matches, it counts the number of times that character is repeated 
	 * and finallay appends the count with the character to the String
	 * @param inputString to compress
	 * @return compressed String
	 */

	private static String compressString(String inputString) {
		char [] charArray=inputString.toCharArray();
		String s="";
		for(int i=0;i<charArray.length;i++){
			if(!s.contains(charArray[i]+"")){ //We are doing this to avoid adding the same character to the String
			s+=charArray[i];
			int count=0;
			for(int j=0;j<charArray.length;j++){
				if(charArray[i]==charArray[j]){
					count++;
				}
			}
			s+=count;
			
		}
		}
		return s;
		
		
	}

}
