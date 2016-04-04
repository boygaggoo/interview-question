package Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTrippletsTest {

	@Test
	public void test() {
		int [] a= {-2, 0, 1, 3};
		
		assertEquals(2,CountTripplets.countWithSmallerValue(a,2));
		assertEquals(2,CountTripplets.SortAndCount(a,2));
	}

}
