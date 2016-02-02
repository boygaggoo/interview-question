package maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	@Test
	public void test() {
	Operations.swapNumbers(10,23);


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
	@Test
	public void minusTest() {
    assertEquals(2, Operations.substract(4,2));	
    assertEquals(12, Operations.substract(14,2));
    assertEquals(10, Operations.substract(40,30));
    assertEquals(-3, Operations.substract(2,5));
    assertEquals(3, Operations.substract(5,2));
    assertEquals(-7, Operations.substract(-5,2));
    assertEquals(-3, Operations.substract(-5,-2));
    assertEquals(2, Operations.substract(3,1));
    assertEquals(-4, Operations.substract(-3,1));
    assertEquals(4, Operations.substract(3,-1));
    assertEquals(3, Operations.substract(-4,-7));
    assertEquals(-3, Operations.substract(-7,-4));
    
}
}
