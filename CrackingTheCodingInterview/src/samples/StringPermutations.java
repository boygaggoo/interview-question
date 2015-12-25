package samples;

import java.util.ArrayList;

public class StringPermutations {

	public static void main(String[] args) {
		permutation("a");

	}

	public static ArrayList<String> permutation(String string) {
		ArrayList<String> result=new ArrayList<>();
		
		if(string.length()==0){
			result.add(string);
			return result;
		}	
		else{
			for(int i=0;i<string.length();i++){
				String shorter=string.substring(0,i)+string.substring(i+1);
				System.out.println(shorter);
				ArrayList<String> shorterPermutations=permutation(shorter);
				for(String s:shorterPermutations){
					result.add(string.charAt(i)+s);
				}
			}
			return result;
			
			}
		
		
	}

}
