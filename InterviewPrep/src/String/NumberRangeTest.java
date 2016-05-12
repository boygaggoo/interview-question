package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberRangeTest {

	@Test
	public void test() {
		assertEquals("1:10,", NumberRange.findRange("1:5,1:10"));
		assertEquals("1:10,", NumberRange.findRange("1:5,1:10"));
		  assertEquals("1:30,",NumberRange.findRange("1:30"));
	      assertEquals("1:7,", NumberRange.findRange("1:5,1:7"));
	      assertEquals("1:7,", NumberRange.findRange("1:5,2:7"));
	        
	     /*   assertEquals("1:30",CompactAndSort.compactAndSort("1:30"));
	        assertEquals("1:10",CompactAndSort.compactAndSort("6:10 , 1:5"));
	        assertEquals("1:5,10:20",CompactAndSort.compactAndSort("10:20 , 1:5"));
	        assertEquals("1:20",CompactAndSort.compactAndSort("10:20  ,  1:5 , 6: 9"));
	        assertEquals("1:5,20:60",CompactAndSort.compactAndSort("50:60, 40:50 , 30:40, 20:30,1:5"));
	        assertEquals("1:15,17:30",CompactAndSort.compactAndSort("1:10,17:30,5:15"));
	        assertEquals("1:15,17:30",CompactAndSort.compactAndSort("1:10,17:30,5:15"));
	        assertEquals("1:20",CompactAndSort.compactAndSort("3:5,4:6,5:7,1:20"));
	        assertEquals("",CompactAndSort.compactAndSort(""));
	        assertEquals("",CompactAndSort.compactAndSort(null));*/
	}

}
