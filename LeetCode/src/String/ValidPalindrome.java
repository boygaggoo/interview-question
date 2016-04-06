package String;
/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author Siddiq Ahmed Syed
 *
 */
public class ValidPalindrome {
	public static void main(String[] args) {
		 System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	        System.out.println(isPalindrome("1a2"));
	        System.out.println(isPalindrome("race a car"));
	}

	private static boolean isPalindrome(String inputString) {
		String str=inputString.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
		if(str.length()<=1){
			return true;
		}
		int end=str.length()-1;
		for(int i=0;i<str.length()/2;i++){
			//if(Character.isLetter(str.charAt(i))&&Character.isLetter(str.charAt(end))){
			if(str.charAt(i)!=str.charAt(end)){
				return false;
			}
			
			end--;
		}
		return true;
	}
}
