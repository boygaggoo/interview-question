package algorithms;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for (int i=0;i<testCase;i++){
			String str=in.next();
			isFunny(str);
		}
		
		
	}

	private static void isFunny(String str) {
		StringBuffer sb=new StringBuffer(str);
		String rv=sb.reverse().toString();
		
		for(int i=1;i<str.length();i++){
			char j=str.charAt(i);
			char k=str.charAt(i-1);
			char l=rv.charAt(i);
			char m=rv.charAt(i-1);
			int diff1=Math.abs(j-k);
			int diff2=Math.abs(l-m);
			
			//System.out.println(diff1+"=="+diff2);
			if(diff1!=diff2){
				System.out.println("Not Funny");
				return;
			}
		}
		
		System.out.println("Funny");
	}

}
