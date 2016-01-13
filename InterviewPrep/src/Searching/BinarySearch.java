package Searching;

public class BinarySearch {
	public static void main(String ...args){
		int [] a={1,2,5,6,7,10};
		int [] b={1,2,4,5,5,5,6};
//		System.out.println(BinarySearch.search(a,2));
//		System.out.println(BinarySearch.searchRecursive(a,0,a.length-1,10));
//	    System.out.println(BinarySearch.firstOccurance(b,5));
	    System.out.println(BinarySearch.lastOccurance(b,5));
	}

/**
 * Iterative approach of Binary Search
 * @param a
 * @param key
 * @return
 */
	private static int search(int[] a, int key) {
		int start=0;
		int end=a.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			//first case if mid equal to key
			if(a[mid]==key){
				return mid;
			}
			//second case if key is first half of array
			else if(key<a[mid]){
				end=mid-1;
			}
			//third case if key is second half of array
			else{
				start=mid+1;
			}
		}
		return -1;
		
	}
  /**
   * Recursive approach of BinarySearch
   * @param a
   * @param start
   * @param end
   * @param key
   * @return
   */

	private static int searchRecursive(int[] a, int start, int end, int key) {
		
		//base case if the key is not found
		if(start>end){
			return -1;
		}	
		int mid=(start+end)/2;
		if(a[mid]==key){
			return mid;
		
		}
		else if(key<a[mid]){
			return searchRecursive(a, start, mid-1, key);
		}
			else{
				return searchRecursive(a, mid+1, end, key);
			}	
		
	}


	 /**
	    * This is sample problem based on BinarySearch 
	    * if array is {1,2,10,10,10,3} the result should be 2
	    * @param a
	    * @param i
	    * @return
	    */
		private static int firstOccurance(int[] a, int key) {
			// TODO Auto-generated method stub
			int low=0,high=a.length-1,result=-1;
			while(low<=high){
				int middle=(low+high)/2;
				if(a[middle]==key){
					result=middle;//storing the occurrance of key
					high=middle-1;
				}
				else if(key<a[middle]){
					high=middle-1;
				}else{
					low=middle+1;
				}
			}
			return result;
		}

		 /**
		    * This is sample problem based on BinarySearch 
		    * if array is {1,2,10,10,10,3} the result should be 4
		    * @param a
		    * @param i
		    * @return
		    */
		private static int lastOccurance(int[] a, int key) {
			// TODO Auto-generated method stub
			int low=0,high=a.length-1,result=-1;
			while(low<=high){
				int middle=(low+high)/2;
				if(a[middle]==key){
					result=middle;
					low=middle+1;
				}
				else if(key<a[middle]){
					high=middle-1;
				}else{
					low=middle+1;
				}
			}
			return result;
		}

}
