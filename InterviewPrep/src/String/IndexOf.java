package String;

public class IndexOf {

	public static int find(String str1, String str2) {
		char c=str2.charAt(0);
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==c){
				return i;
			}
		}
		return -1;
	}

}
