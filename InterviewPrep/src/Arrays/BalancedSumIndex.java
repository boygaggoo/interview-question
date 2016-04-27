package Arrays;

import java.util.Arrays;
/**
 * Given an array of numbers (assume the array has three or more values, 
 * and they are indeed numbers), 
 * return an index, if one exists,
 *  where the sums of the elements on either side of that index are equal.

eg. [2, 3, 4, 4, 1] given the function this array should return index 2
 (element with value 4) because the sums on either side are equal (2 + 3 = 4 + 1).  
 * @author Siddiq Ahmed Syed
 *
 */
public class BalancedSumIndex {
	public static void main(String[] args) {
	    int inputArray[] = new int[]{2, 3, 4, 4, 1};
	    System.out.println("inputArray: " + Arrays.toString(inputArray));
	    int pivot = findPivotIndex(inputArray);
	    System.out.println("Pivot index is: " + pivot);

	    inputArray = new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 4, 1, 1, 0, 2, 9, 3, 8, 4, 7, 5, 6, 0, 0, 0, 0, 0};
	    System.out.println("inputArray: " + Arrays.toString(inputArray));
	    pivot = findPivotIndex(inputArray);
	    System.out.println("Pivot index is: " + pivot);
	  }
	public static int findPivotIndex(int[] inputArray) {

	    int leftPointer = 0, leftSum = 0, rightSum = 0;
	    int rightPointer = inputArray.length - 1;

	    while (rightPointer != leftPointer) {
	      if (leftSum >= rightSum) {
	        rightSum += inputArray[rightPointer];
	        //System.out.println("right sum is " + rightSum);
	        rightPointer--;
	      } else {
	        leftSum += inputArray[leftPointer];
	        //System.out.println("left sum is " + leftSum);
	        leftPointer++;
	      }
	    }

	    if (leftSum == rightSum) {
	      return leftPointer;
	    }

	    return -1;
	  }

}
