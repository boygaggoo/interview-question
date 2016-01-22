package random;

import static org.junit.Assert.*;

import org.junit.Test;

public class OccuranceSortedListTest {

	@Test
	public void test() {
	  int [] a={1,2,3,3,3,3,3,4,5,6};
	  assertEquals(2,OccuranceSortedList.countOcc(a,3,true));
	  assertEquals(5,OccuranceSortedList.totalCount(a,3));
	}

}
