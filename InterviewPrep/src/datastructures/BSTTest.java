package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTTest {

	@Test
	public void insertTest() {
		BST tree=new BST(5);
		tree.insert(10);
		tree.insert(2);
		tree.insert(11);
		for(int i=0;i<200;i+=7){
			tree.insert(i);
		}
		assertEquals(true,tree.search(0));
		assertEquals(true,tree.search(7));
		assertEquals(true,tree.search(14));
		for(int i=0;i<50;i+=7){
			assertEquals(true,tree.search(i));
		}
		assertEquals(false,tree.search(257));
		for(int i=210;i<300;i+=7){
			assertEquals(false,tree.search(i));
		}
		
	}

}
