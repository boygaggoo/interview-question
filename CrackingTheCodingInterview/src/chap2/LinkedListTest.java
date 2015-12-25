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
	        
	    }
	@Test
	public void containsTest() {
		
		
		assertEquals(true,words.contains("new"));
	}
	@Test
	public void getTest() {
		
		assertEquals("new",words.get(1));
	}
	@Test
	public void removeTest() {
		words.add("test");
		assertEquals("new",words.remove("new"));
	}

}
