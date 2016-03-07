package String;

import java.awt.List;
import java.util.ArrayList;

public class PermutationString {

	public static ArrayList<String> permuatate(String str) {
		ArrayList<String> result=new ArrayList<>();
		if(str.length()<=1){
			 result.add(str);
		 }
		else{
		char c=str.charAt(0);
		
		String remainString=str.substring(1, str.length());
		ArrayList<String> permutatedStrings=permuatate(remainString);
		for(String permutation:permutatedStrings){
			 result.addAll(addChar(permutation,c));
		}
		}
		return result;
		
	}

	private static ArrayList<String> addChar(String str, char c) {
		ArrayList<String> result=new ArrayList<String>();
		for(int i=0;i<str.length()+1;i++){
			  String newString= str.substring(0,i)+c+str.substring(i,str.length());
			  System.out.println(newString);
			  result.add(newString);
			}
		    return result;
	}

}
