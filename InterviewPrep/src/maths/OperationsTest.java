package maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	@Test
	public void test() {
	Operations.swapNumbers(1,2);

	}
	@Test
	public void multiplyTest() {
    assertEquals(6, Operations.multiply(2,3));	
    assertEquals(100, Operations.multiply(10,10));
    assertEquals(-20, Operations.multiply(-2,10));
    assertEquals(483, Operations.multiply(21,23));
}
	@Test
	public void divideTest() {
    assertEquals(2, Operations.divide(4,2));	
    assertEquals(7, Operations.divide(14,2));
    assertEquals(20, Operations.divide(40,2));
    
}
}
