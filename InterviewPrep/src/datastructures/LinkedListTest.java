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
		ll.add(2);
		ll.add(3);
		ll.print();
		ll.addAt(1,4);
		ll.print();
		ll.addAt(0,0);
		ll.print();
		ll.addAt(3,5);
		ll.print();
		
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
	@Test
	public void kToLastElemTest(){
		ll.add(1);
		ll.add(2);
		assertEquals(1,ll.kToLastElem(1));
		assertEquals(2,ll.kToLastElem(0));
	}
	@Test
	public void kToLastElemRecTest(){
		ll.add(1);
		ll.add(2);
		assertEquals(1,ll.kToLastRecElem(1));
		assertEquals(2,ll.kToLastRecElem(0));
	}
	@Test
	public void kToLastElemIterTest(){
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		assertEquals(6,ll.kToLastIterElem(1));
		assertEquals(4,ll.kToLastIterElem(3));
//		assertEquals(2,ll.kToLastIterElem(0));
	}
	@Test
	public void deleteNodetest(){
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		Node n=ll.getNode(2);
		
		assertEquals(true,ll.deleteNode(n));
		
	
	}
	@Test
	public void partitionTest(){
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.print();
		Node n=ll.partition(2);
	    while(n!=null){
	    	System.out.println(n.data);
	    	n=n.next;
	    
	    }
	    }
	@Test
	public void isPalindromeTest(){
	ll.add(1);
	ll.add(0);
	ll.add(0);
	ll.add(1);
	assertEquals(true,ll.isPalindrome());
	ll.add(4);
	ll.add(2);
	assertEquals(false, ll.isPalindrome());
	
	}
	@Test
	public void removeKLastElemTest(){
	ll.add(1);
	ll.add(3);
	ll.add(0);
	ll.add(1);
	ll.print();
	assertEquals(0,ll.removeKLast(2));
	ll.print();
	ll.add(5);
	ll.add(10);
	ll.print();
	ll.removeKLast(3);
	ll.print();
	
	}
	@Test
	public void partitionTest2(){
	ll.add(1);
	ll.add(5);
	ll.add(7);
	ll.add(3);
	ll.add(2);
	ll.print();
	Node n=ll.partition2(2);
	while(n!=null){
		System.out.println(n.data);
		n=n.next;
	}
	}
	@Test
	public void addFirstTest(){
	ll.add(1);
	ll.add(2);
	ll.print();
	ll.addFirst(3);
	ll.print();
	ll.addFirst(5);
	ll.print();
	ll.addFirst(4);
	ll.print();
	
	}
	


}
