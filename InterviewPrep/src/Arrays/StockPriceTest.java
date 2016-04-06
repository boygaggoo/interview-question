package Arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StockPriceTest {

	@Test
	public void bruteForceTest() {
		int [] a={1,4,5,11};
		int [] b={10,11,1,12};
		assertEquals(10,StockPrice.bruteForce(a));
		assertEquals(11,StockPrice.bruteForce(b));
		
	}
	@Test
	public void divideAndConquerTest() {
		int [] a={1,4,5,11};
		int [] b={10,11,1,12};
		assertEquals(10,StockPrice.divideAndConquer(a));
		assertEquals(11,StockPrice.bruteForce(b));
		
	}
	@Test
	public void simpleSolTest() {
		int [] a={1,4,5,11};
		int [] b={10,11,1,12};
		assertEquals(10,StockPrice.simpleSolution(a));
		assertEquals(11,StockPrice.simpleSolution(b));
		assertEquals(11,StockPrice.simpleSolutionWithIndexes(b)[2]);
		
	}

}
