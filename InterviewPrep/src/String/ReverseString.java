package String;

public class ReverseString {

	public static String reverseUsingIteration(String str) {
		StringBuilder result=new StringBuilder();
		
		
		for(int i=str.length()-1;i>=0;i--){
			result.append(str.charAt(i));
		}
		return result.toString();
	}

	public static String reverseUsingRecursion(String str) {
		if(str.length()<2){
			return str;
		}
		return reverseUsingRecursion(str.substring(1))+str.charAt(0);
	}

}
