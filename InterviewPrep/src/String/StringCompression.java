package String;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("Solution:"+compress("aabbcccd"));
		System.out.println("Solution:"+compress(""));
	}

	private static String compress(String str) {
		if(str.length()<1){
			return str;
		}
        String result="";
		int count=1;
		char prev=str.charAt(0);
		for(int i=1;i<str.length();i++){
		if(prev==str.charAt(i)){
			count++;
		}
		else{
			result+=prev+""+count;
			count=1;
			prev=str.charAt(i);
		}
		}
		result+=prev+""+count;
		return result;
	}

}
