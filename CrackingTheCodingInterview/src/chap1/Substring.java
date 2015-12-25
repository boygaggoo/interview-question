package chap1;

import org.hamcrest.core.IsSame;

public class Substring {

	public static boolean isRotation(String s1, String s2) {
		int len=s1.length();
		if(len!=s2.length()){
			return false;
		}
		String s1s1=s1+s1;
		System.out.println(s1s1);
		
		return isSubstring(s1s1,s2);
		
	
		
	}

	private static boolean isSubstring(String s, String t) {
		
		return s.indexOf(t) == -1 ? false : true;
	}

}
