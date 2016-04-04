package String;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
	public static void main(String[] args) {
		System.out.println(palindromePartition("racecar"));
		System.out.println(isPalindrome("nitin"));
	}

	private static List<String> palindromePartition(String str) {
		List<String> result=new ArrayList<String>();
		int end=str.length()-1;
		for(int i=0;i<str.length()/2;i++){
			if(isPalindrome(str.substring(i,end))){
				result.add(str.substring(i,end));
			}
			end--;
		}
		return result;
	}

	private static boolean isPalindrome(String substr) {
		for(int i=0,j=substr.length()-1;i<substr.length()/2;i++){
			if(substr.charAt(i)!=substr.charAt(j)){
				return false;
			}
			j--;
		}
		return true;
	}

}
