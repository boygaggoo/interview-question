package random;

/**
 * One of the interview questions
 * @author Siddiq Ahmed Syed
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("hello"));

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		if(str.length()<=1)
			return str;
		else
		return ""+str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
		
	}

}
