package datastructures;

import java.util.HashSet;
import java.util.Set;

public class ArraysPractice {

	public static String maxMin(int[] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		if(arr.length==1){
			return "Max:"+arr[0]+"\nMin:"+arr[0]; 
		}
		else{
			max=arr[0];
			min=arr[0];
			for(int i=1;i<arr.length;i++){
				
				if(arr[i]<=min){
					min=arr[i];
				}
				else if(arr[i]>=max){
					max=arr[i];
				}
			}
		}
		
		return "Max:"+max+"\nMin:"+min; 
		
	}
	public static int[] reverse3(int[] nums) {
	      
	      for(int i=0;i<nums.length/2;i++){
	    	  int temp=nums[i];
	    	  nums[i]=nums[nums.length-1-i];
	           nums[nums.length-1-i]=temp;
	           
	      
	      }
	      return nums;
	}
	public static void print(int[] arr) {
		System.out.println();
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}
	public static boolean no23(int[] nums) {
		if(nums[0] == 2 || nums[0] == 3)
			return true;
		return (nums[1] == 2 || nums[1] == 3);
		}
	
	public boolean double23(int[] nums) {
		if(nums.length==0){
			return false;
		}
		if(nums.length==1){
			if(nums[0]==2||nums[0]==3){
				return true;
			}
			else{
				return false;
			}
		}
		  return nums[0]==2&&nums[1]==2||nums[0]==3&&nums[1]==3;
		}
	public static int findMissingInteger(int[] a, int count) {
		int expectedSum=count*((count+1)/2);
		int sum=0;
		for(int i:a){
			sum+=i;
		}
	
		
		return expectedSum-sum;
	}
	/** * Prints all pair of integer values from given array whose sum is is equal to given number. 
	 * * complexity of this solution is O(n^2) */

	
	public static void printPairs(int[] a, int sum) {
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					System.out.println("Pairs:"+a[i]+","+a[j]);
				}
			}
			
		}
		
	}
	/** * Prints all pair of integer values from given array whose sum is is equal to given number. 
	 * * complexity of this solution is O(n) */
	
	public static void printPairsPerfect(int[] a, int sum) {
		Set set=new HashSet<>();
		for(int i:a){
			int target=sum-i;
			if(!set.contains(target)){
				set.add(i);
			}
			else{
				System.out.println("Pairs:"+i+","+target);
			}
		}
		
	}
	/**
	 * This method removes the duplicates from array
	 * @param array
	 * @return array where duplicates are replaced by 0
	 */
	public static int[] removeDuplicates(int[] a) {
		Set set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			if(!set.contains(i)){
				set.add(a[i]);
			}
			else{
				a[i]=0;
			}
			
		}
		return a;
		
	}
	/**
	 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3. 

	 * @param nums
	 * @return
	 */
	public static int[] midThree(int[] nums) {
		  int len=3;
		  int [] newArray=new int[3];
		  int mid=nums.length/2;
		  for(int i=0;i<len;i++){
		        newArray[i]=nums[mid-1];
		        mid++;
		  
		  }
		  return newArray;
		}



}
