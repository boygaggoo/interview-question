package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysPracticeTest2 {

	@Test
	public void test() {
		int a[] ={1,2,3};
		assertEquals("Max:3Min:1", ArraysPractice.maxMin(a));
		
	}

}
