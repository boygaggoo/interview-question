package Sorting;

import static org.junit.Assert.*;

import org.junit.Test;



public class SortAlgosTest {

	@Test
	public void test() {
	 int [] a={4,3,1,2,7,10,9,8,-1,-4,-10,-7,5,3,4};

	 Util.printArray(SelectionSort.sort(a));
	 Util.printArray(BubbleSort.sort(a));
	 Util.printArray(InsertionSort.sort(a));
	 Util.printArray(MergeSort.sort(a));
	 Util.printArray(QuickSort.sort(a));
	}

}
