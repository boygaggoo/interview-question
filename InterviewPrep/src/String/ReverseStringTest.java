package String;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		assertEquals("olleh",ReverseString.reverseUsingIteration("hello"));
		assertEquals("tae",ReverseString.reverseUsingIteration("eat"));
		assertEquals("tae",ReverseString.reverseUsingRecursion("eat"));
		assertEquals("tae",ReverseString.reverseUsingRecursion2("eat"));
		assertEquals("racecar",ReverseString.reverseUsingRecursion2("racecar"));
		
	}
	@Test
	public void test2(){
		System.out.println( ReverseString.reverseWithSpecialCharInPlace("a,b$c"));
		assertEquals("c,ba", ReverseString.reverseWithSpecialCharInPlace("a,bc"));
	}
	
	
	

}
