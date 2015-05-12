package coding.interview.chap1;

import java.util.Scanner;
/**
 * The task is to replace the spaces present between any two word
 * in the String with %20 and remove the trailing spaces
 * @author Siddiq Ahmed Syed
 *
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String inputString=in.nextLine();
		removeSpace(inputString,"%20");

	}
	/**
	 * This method will remove any trailing space
	 * and will replace the space with the given String
	 * @param inputString 
	 * @param replaceWith String to be replaced with the spaces
	 */

	private static void removeSpace(String inputString, String replaceWith) {
		String newString=inputString.trim();//removes any trailing spaces
		
		newString=newString.replaceAll(" ", replaceWith);
	
		System.out.println(newString);
		
		
		
	}

}
