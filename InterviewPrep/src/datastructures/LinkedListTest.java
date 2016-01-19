package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void setUptest() {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add("yes");
		ll.insertAfter(1,3);
		ll.print();
	}

	@Test
	public void defaultTest() {
	java.util.LinkedList<Object> test=new java.util.LinkedList<>();
	test.add(1);
	test.add(2);
	
	System.out.println(test.getFirst());
	
	}
	
	

}
