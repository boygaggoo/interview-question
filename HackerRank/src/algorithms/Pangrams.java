package algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(isPanagram(s));
	}

	private static String isPanagram(String str) {
		String s=str.toLowerCase();
		Set<Character> set=new HashSet<Character>();
		for (int i=0;i<s.length();i++){
			
			char c=s.charAt(i);
			if(Character.isLowerCase(c)){
			if(!set.contains(c)){
				set.add(c);
				}
			}
		}
	
		return set.size()==26?"pangram":"not pangram";
	}
}
