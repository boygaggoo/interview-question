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

	public static String reverseUsingRecursion2(String str) {
		// TODO Auto-generated method stub
		if(str.length()<2){
			return str;
		}
		return str.charAt(str.length()-1)+reverseUsingRecursion2(str.substring(0,str.length()-1));
	}

	public static String reverseWithSpecialCharInPlace(String str) {
		// TODO Auto-generated method stub
		char [] strArray=str.toCharArray();
		int end=strArray.length-1;
		for(int i=0;i<strArray.length/2;i++){
			if(Character.isLetter(strArray[i])&&Character.isLetter(strArray[end])){
				char temp=strArray[i];
				strArray[i]=strArray[end];
				strArray[end]=temp;
				
			}
			end--;
		}
		return new String(strArray);
	}
 

}
