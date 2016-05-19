package String;

public class ReplaceSpaces {
public static void main(String[] args) {
	System.out.println(replace("my name is","%20"));
	
}



private static String replace(String str, String repl) {
	char [] strArray=str.toCharArray();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==' '){
			str=str.substring(0,i)+repl+str.substring(i+1);
			
		}
	}
	return str;
}
}
