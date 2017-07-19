package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		String str="ab";
//		permutation(str.toCharArray(),str.length());
//		permutation2("", str);
		System.out.println(permutation3(str));
	}

	private static List<String> permutation3(String str) {
		ArrayList<String> result=new ArrayList<>();
		if(str.length()<=1){
			 result.add(str);
		 }
		else{
		char c=str.charAt(0);
		
		String remainString=str.substring(1, str.length());
		List<String> permutatedStrings=permutation3(remainString);
		for(String permutation:permutatedStrings){
			 result.addAll(addChar(c,permutation));
		}
		}
		return result;
		
		
	}

	private static List<String> addChar(char c, String st) {
		// TODO Auto-generated method stub
		List<String> permutatedString=new ArrayList<>();
		for(int i=0;i<st.length()+1;i++){
			String str=st.substring(0,i)+c+st.substring(i);
			permutatedString.add(str);
		}
		return permutatedString;
	}

	private static void permutation2(String prefix, String str) {
		int n=str.length();
		if(n==0)System.out.println(prefix);
		else{
			for(int i=0;i<n;i++)
			permutation2(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
		}
	}

	private static void permutation(char[] arr,int n) {
		if(n==1){
			System.out.println(Arrays.toString(arr));
		}else{
			for(int i=0;i<n-1;i++){
				permutation(arr, n-1);
				if(n%2==1){
					swap(arr,0,n-1);
				}else{
					swap(arr,i,n-1);
				}
			}
			permutation(arr, n-1);
		}
		
	}
	

	private static void swap(char[] arr, int i, int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
