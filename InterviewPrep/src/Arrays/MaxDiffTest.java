package Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDiffTest {

	@Test
	public void test() {
		int [] a={1,2,3,4,5};
		int [] b={1,-1,2,5};
		System.out.println(MaxDiff.profit(a));
		assertEquals(4, MaxDiff.diff(a));
		assertEquals(6, MaxDiff.diff(b));
	} 

}
