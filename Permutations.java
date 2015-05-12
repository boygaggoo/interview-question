package coding.interview.chap1;

import java.util.Arrays;

/**
 * The task is to check if one String is permutation of another String
 * @author Siddiq Ahmed Syed
 *
 */

public class Permutations {

	public static void main(String[] args) {
		String s1="kikla";
		String s2="akkll";
		System.out.println(isPermutation(s1,s2));
		
	

	
	}
	/**
	 * This method will check if one String is a permutation of another String
	 * @param String one is the base String. We are converting the Strings to character Arrays and then 
	 * sorting them in order to compare
	 * @param  String two to be compared with String one
	 * @return True/False
	 */


	private static boolean isPermutation(String s1, String s2) {
		
		//The first step to check their length. If there are not equal then 
		//they are not equal
		if(s1.length()!=s2.length()){
			return false;
		}
		else {
		
			char [] firstString=s1.toCharArray();
			char [] secondString=s2.toCharArray();
			Arrays.sort(firstString);
			Arrays.sort(secondString);
			for(int i=0;i<firstString.length;i++){
				if(firstString[i]!=secondString[i]){
					return false;
				}
			}
				
			}
			return true;
		
	}
	}

