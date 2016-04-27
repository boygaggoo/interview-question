package String;

public class LengthOfLastWord {
public static void main(String[] args) {
	System.out.println(lastWordLength("hello World"));
}

private static int lastWordLength(String str) {
	if(str.length()<=1){
		return 0;
	}
	String[] resultArray=str.split(" ");
	return resultArray[resultArray.length-1].length();
}
}
