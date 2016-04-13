package Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int [] a={1,2,3,4};
	System.out.println(find(a,4));
}

private static int find(int[] a, int target) {
	 
	 int start=0;
	 int end=a.length-1;
	 while(start<=end){ 
		 int mid=(start+end)/2;
		 if(a[mid]==target){
			 return mid;
		 }
		 else if(target<a[mid]){
			 end=mid-1;
		 }else{
			 start=mid+1;
		 }
	 }
	 return -1;
	
}
}
