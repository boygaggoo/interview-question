package String;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String [] str={"aaa","aab","aab"};
		System.out.println(longestCommonPrefix(str));
	}

	private static String longestCommonPrefix(String[] str) {
		if (str.length<1){
			return "";
		}
		String result=str[0];
		for(int i=1;i<str.length;i++){
			result=prefix(result,str[i]);
		}
		return result;
	}

	private static String prefix(String str1, String str2) {
		 int min=Math.min(str1.length(),str2.length());
		 int i=0;
		 for(;i<min;i++){
			 if(str1.charAt(i)!=str2.charAt(i))break;
		 }
		return str1.substring(0,i);
	}

}
