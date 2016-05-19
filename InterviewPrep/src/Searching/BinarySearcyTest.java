package Searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearcyTest {

	@Test
	public void test() {
		int [] a={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		  		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		System.out.println(findElem(a,73));
	}

	private int findElem(int[] a, int searchElem) {
		int start=0;
		int end=a.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(a[mid]==searchElem){
				return mid;
			}
			else if(searchElem<a[mid]){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return -1;
		
	}

}
