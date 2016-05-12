package String;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class PermutationStringTest {

	@Test
	public void test() {
		//System.out.println(PermutationString.permutateIterative("abc"));
//	System.out.println(PermutationString.permuatate("abc"));
     System.out.println(findPermutation("ab"));
//		System.out.println("hello".substring(0,1)+"c"+"hello".substring(1,4));
	}

	private List<String> findPermutation(String str) {
		// TODO Auto-generated method stub
		List<String> permutations=new ArrayList<String>();
		if(str.length()<=1){
			permutations.add(str);
		}
		else{
		char c=str.charAt(0);
		String substring=str.substring(1);
		
		List<String> permutate=findPermutation(substring);
		for(int i=0;i<substring.length();i++){
			String sub=substring.substring(0,i)+c+substring.substring(i);
			permutations.add(sub);
		}
	/*	for(String s:permutate){
			permutations.addAll(addChar(s,c));
		}*/
		}
		return permutations;
	}

	private List<String> addChar(String s, char c) {
		List<String> result=new ArrayList<String>();
		for(int i=0;i<s.length()+1;i++){
			String str=s.substring(0, i)+c+s.substring(i,s.length());
			result.add(str);
		}
		return result;
	}

}
