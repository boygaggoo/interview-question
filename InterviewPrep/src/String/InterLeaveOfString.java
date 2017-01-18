package String;

public class InterLeaveOfString {
	public static void main(String[] args) {
		System.out.println(isInterleave("ab","bc","abbc"));
		System.out.println(isInterleave("ab","de","adbe"));
	}

	private static boolean isInterleave(String str1, String str2, String str3) {
		char [] ar1=str1.toCharArray();
		char [] ar2=str2.toCharArray();
		char[] ar3=str3.toCharArray();
		int len1=ar1.length,len2=ar2.length,len3=ar3.length;
		int i=0,j=0,k=0;
		if(len3!=len1+len2){
			return false;
		}
		while(k<len3){
			if(i<len1&&ar1[i]==ar3[k]){
				i++;
			}
			else if(j<len2&&ar2[j]==ar3[k]){
				j++;
			}
			else{
				return false;
			}
			k++;
		}
		return true;
	}

}
