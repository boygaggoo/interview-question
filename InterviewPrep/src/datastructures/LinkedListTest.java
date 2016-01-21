package datastructures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class LinkedListTest {
	LinkedList ll=new LinkedList();;
	@Test
	public void setUp() {
		
		ll.add(1);
		ll.add(2);
		ll.add("yes");
		ll.insertAfter(1,-2);
		ll.add(3);
		//ll.print();
	}

	@Test
	public void addAtTest(){
		ll.add(1);
		ll.add("test");
		ll.addAt(0,"wow");
		
	}
	@Test
	public void containsTest(){
		ll.add(1);
		ll.add(2);
		ll.add(4);
		Assert.assertEquals(true,ll.contains(1));
		Assert.assertEquals(false,ll.contains(9));
		
	}
	@Test
	public void getFirstTest(){
		ll.add(1);
		ll.add(2);
		ll.add(4);
		Assert.assertEquals(1,ll.getFirst());
		
		
	}
	@Test
	public void getFirstNullTest(){
		
		Assert.assertEquals(null,ll.getFirst());
		
		
	}
	@Test
	public void sizeTest(){
	 ll.add(1);
	 ll.add(2);
	 Assert.assertEquals(2, ll.size());
	 ll.addAt(0,4);
	 ll.insertAfter(2, 9);
	 Assert.assertEquals(4, ll.size());
		
		
	}
	@Test
	public void getTest(){
		ll.add(1);
		ll.add(2);
		ll.add(3);
		assertEquals(2, ll.get(1));
	}
	
	@Test
	public void removeDuplicateTest(){
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.print();
		ll.removeDuplicates().print();
	}
	@Test
	public void removeTest(){
		ll.add(2);
		ll.add(4);
		assertEquals(2,ll.removeFirst());
		assertEquals(1, ll.size());
		assertEquals(4, ll.removeFirst());
		assertEquals(0, ll.size());
		ll.add(1);
		assertEquals(1, ll.removeFirst());
		assertEquals(null, ll.getFirst());
		
	}
	@Test
	public void removeAtTest(){
		ll.add(1);
		ll.add(2);
		
		ll.add(3);
		assertEquals(2, ll.removeAt(1));
		ll.add(4);
		ll.add(5);
		ll.print();
		assertEquals(1, ll.removeAt(0));
		
		ll.print();
		assertEquals(5, ll.removeAt(ll.size()-1));
	}
	@Test
	public void removeDuplicates(){
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(3);
		ll.add(1);
		ll.add(1);
//		ll.print();
		ll.removeAllDuplicates();
		ll.add(3);
		ll.add(1);
		ll.add(1);
		ll.print();
		ll.removeAllDuplicates2();
		ll.add(1);
		ll.print();
		ll.removeAllDuplicates2();
		ll.print();
		
	}
	

}
