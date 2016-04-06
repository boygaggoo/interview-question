package String;
/**
 * '?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
 * @author Siddiq Ahmed Syed
 *
 */
public class WildCard {
	public static void main(String[] args) {
		System.out.println(isMatch("aa","*"));
		System.out.println(isMatch("aa","c*"));
	}

	private static boolean isMatch(String str, String str2) {
		if(str2.contains("*")&&str2.length()==1){
			return true;
		}
		else if(str2.charAt(0)==str.charAt(0)||str2.charAt(0)=='?'){
			if(str2.equals(str))
				return true;
			return str2.charAt(1)=='*';
		}
		return false;
	}
}
