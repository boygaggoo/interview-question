package Recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		System.out.println(findRecusively(a,4,0,a.length));
	}

	private static int findRecusively(int[] num, int target,int start,int end) {
		int mid=(start+end)/2;
		if(start>end){
			return -1;
		}
		if(num[mid]==target){
			return mid;
		}
		else if(num[mid]>target){
			return findRecusively(num, target, start, mid-1);
		}else{
			return findRecusively(num, target, mid+1, end);
		}
	
	}
	
	private static int findIteratively(int [] num,int target){
		int start=0;
		int end=num.length;
		
		while(start<end){
			int mid=(start+end)/2;
		if(num[mid]==target){
			return mid;
		}else if(num[mid]>target){
			end=mid-1;
		}else{
			start=mid+1;
		}
		}
		return -1;
		
		
	}

}
