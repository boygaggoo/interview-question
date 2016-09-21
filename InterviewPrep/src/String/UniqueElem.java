package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class UniqueElem {
public static void main(String[] args) {
	String s="barbara";
	System.out.println(getUniqueElems(s));
	System.out.println(morseCodes(2, 3));
}

private static String getUniqueElem(String s) {
	StringBuilder result=new StringBuilder();
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	for(char c:s.toCharArray()){
	     if(hm.containsKey(c)){
	    	 int count=hm.get(c);
	    	 hm.put(c, count+1);
	     }else{
	    	 hm.put(c,1);
	     }
	}
	for(java.util.Map.Entry<Character, Integer> entry:hm.entrySet()){
		if(entry.getValue()==1){
			result.append(entry.getKey());
		}
	}
	return result.toString();
}
private static String getUniqueElems(String s) {
	StringBuilder result=new StringBuilder();
	
	char [] arr=s.toCharArray();
	for(int i=0;i<arr.length;i++){
	    char c=arr[i];
	    int charIndex=result.indexOf(c+"");
	     if(charIndex!=-1){
	    	result.deleteCharAt(charIndex);
	     }else{
	    	result.append(c);
	     }
	}

	return result.toString();
}
public static Set<String> morseCodes(int m, int n)
{
	String inputString="";
	for(int i=0;i<m;i++){
		inputString+='.';
	}
	for(int i=0;i<n;i++){
		inputString+='-';
	}
	System.out.println(inputString);
   Set<String> result = permutateIterative(inputString);
return result;
  
}
public static Set<String> permutateIterative(String str){
//	ArrayList<String> result=new ArrayList<String>();
	Set<String> result = new TreeSet<>();
	
//	char c=str.charAt(0);
//	String subString=str.substring(1,str.length());
	for(int i=0;i<str.length();i++){
		
		char c=str.charAt(i);
//		System.out.println("Char:"+c);
		String subString=str.substring(0,i)+str.substring(i+1,str.length());
//        System.out.println("Substring:"+subString);			
		result.addAll(addChar(subString, c));
	}
	
	return result;
}
private static ArrayList<String> addChar(String str, char c) {
	ArrayList<String> result=new ArrayList<String>();
	for(int i=0;i<str.length()+1;i++){
		  String newString= str.substring(0,i)+c+str.substring(i,str.length());
		 // System.out.println(newString);
		  result.add(newString);
		}
	    return result;
}
}
