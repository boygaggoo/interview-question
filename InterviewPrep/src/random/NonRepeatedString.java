package random;

import java.util.HashMap;

public class NonRepeatedString {
	public static void main (String ... args){
		System.out.println(firstNonRepeated("stress",false));
		System.out.println(firstNonRepeated("stress",true));
		System.out.println(firstNonRepeated("teeter",true));
	}

	private static char firstNonRepeated(String str,boolean flag) {
	    HashMap<Character, Integer> map=new HashMap<>();
	    char sol = 0;
	    int max=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				
				
				if(!flag){
				if(map.get(c)==1){
					return c;
				}
				}
				else{
					if(max < map.get(c)){
						sol=c;
						max=map.get(c);
					}
				}
			}
			return sol;
	}

}
