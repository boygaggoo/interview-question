package String;

import java.util.Arrays;

public class SortStringBasedOnLength {
	public static void main(String[] args) {
		
	
  String [] arr={"abc","a","ab"};
  System.out.println(Arrays.toString(bubbleSort(arr)));
  System.out.println(Arrays.toString(mergeSort(arr)));
	}

	private static String[] mergeSort(String[] arr) {
		if(arr.length<=1){
			return arr;
		}
		int mid=arr.length/2;
		String [] firstHalf=new String[mid];
		String [] secondHalf=new String[mid];
		for(int i=0;i<mid;i++){
			firstHalf[i]=arr[i];
		}
		int start=0;
		for(int i=mid;i<arr.length;i++){
			secondHalf[start]=arr[i];
			start++;
		}
		return null;
	}

	private static String[] bubbleSort(String[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i].length()>arr[j].length()){
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
			}
		}
		return arr;
	}
}
