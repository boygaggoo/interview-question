package com.softnice.aircraft;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
/**
 * Test class for testing the methods of the classes
 * @author Siddiq Ahmed Syed
 *
 */
public class ACTest {

	@Test
	public void typeTest() {
		AC ac1=new AC("passenger","small");
		AC ac2=new AC("Cargo","small");
		assertEquals(3, ac2.getType());
		assertEquals(4, ac1.getType());
		
	}
	@Test
	public void sizeTest() {
		AC ac1=new AC("Passenger","small");
		AC ac2=new AC("Cargo","large");
		assertEquals(1, ac1.getSize());
		assertEquals(2, ac2.getSize());
	}
	@Test
	public void sortingTest() {
		AC ac1=new AC("Cargo","small");
		AC ac2=new AC("Cargo","small");
		AC ac3=new AC("Passenger","small");
		ArrayList<AC> al=new ArrayList<AC>();
		al.add(ac1);
		al.add(ac2);
		al.add(ac3);
	
		Collections.sort(al,Collections.reverseOrder(new PriorityComparator()));
		assertEquals(al.remove(0).getType(),4);
	}

}
