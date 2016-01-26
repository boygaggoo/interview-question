package random;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortedArraysTest {

	@Test
	public void test() {
		int [] a={1,1,1,2,3,3,4,5,5};
		int [] b={4,4,2,2,1,1,5,5,3,3};
		int [] c={1,2,1,3,2,4,2,5};
		
//		assertEquals(5, SortedArrays.removeDuplicates(c));
//		assertEquals(5, SortedArrays.removeDuplicates2(b));
//		assertEquals(5, Arrays.toString(SortedArrays.removeDuplicates3(a)));
		assertEquals(Arrays.toString(new int[]{1,2,3,4,5}),Arrays.toString(SortedArrays.removeDuplicates4(a)));
	
	}

}
