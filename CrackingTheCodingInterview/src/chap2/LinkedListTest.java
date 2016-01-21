package chap2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	LinkedList words;
	 @Before
	    public void setUp() {
		 words=new LinkedList();
		 words.add("hello");
			words.add("new");
			words.add("world");
			words.add("reason");
	        
	    }
	@Test
	public void containsTest() {
		
		
		assertEquals(true,words.contains("new"));
	}
	@Test
	public void getTest() {
		
		assertEquals("hello",words.get(0));
	}
	@Test
	public void removeTest() {
		words.add("test");
		assertEquals("test",words.remove("test"));
		assertEquals("new",words.remove("new"));
	}
	/**
	 * This is the interview question
	 */
	@Test
	public void removeDupl() {
		words.add("new");
		words.add("test");
		words.add("test");
		words.removeDuplicates();
//		words.print();
	
	}
	/**
	 * This is the interview question
	 */
	@Test
	public void getKLastElemTest() {
		words.add("cracking");
		words.add("interview");
		assertEquals("interview",words.getKLast(1));
		assertEquals("cracking",words.getKLast(2));
	
	
	}
	@Test
	public void recursivegetKLastElemTest() {
		words.add("cracking");
		words.add("interview");
		assertEquals("interview",words.recursivegetKLast(1));
	
	
	
	}

}
