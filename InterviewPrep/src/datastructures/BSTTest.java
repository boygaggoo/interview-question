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
		tree.print();
	
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
	@Test
	public void minMaxTest(){
		BST tree=new BST(5);
		tree.insert(10);
		tree.insert(2);
		tree.insert(11);
		tree.insert(1);
		tree.insert(0);
		tree.insert(0);
		assertEquals(11, tree.max());
		assertEquals(0, tree.min());
		for(int i=0;i<30;i++){
			tree.insert(i);
		}
		assertEquals(0, tree.min());
		assertEquals(29, tree.max());
	}
	@Test
	public void heightTest(){
		BST tree=new BST(5);
		tree.insert(1);
		tree.insert(10);
		assertEquals(1, tree.height());
		for(int i=0;i<20;i++){
			tree.insert(10);
		}
		assertEquals(21, tree.height());
	}
	@Test
	public void orderTest(){
		BST tree=new BST(5);
		for(int i=0;i<20;i++){
			tree.insert(i);
		}
		System.out.println("INORDER");
		tree.inorder();
		System.out.println("PREORDER");
		tree.preorder();
		System.out.println("POSTORDER");
		tree.postorder();
		System.out.println("LEVELORDER");
		tree.levelorder();
		
	}
	/**
	 * Check if a binary tree is binary search tree
	 */
	
	@Test
	public void bstTest(){
		BST tree=new BST(10);
		for(int i=0;i<5;i++){
			tree.insert(i);
		}
		
		assertEquals(true, tree.bstTest());
		assertEquals(true, tree.isBST());
	}
	@Test
	public void deleteNodeTest(){
		BST tree=new BST(10);
		tree.insert(4);
		tree.insert(13);
		tree.insert(9);
		tree.insert(3);
		tree.insert(12);
		tree.insert(14);
		
		
		tree.print();
		tree.delete(14);
		System.out.println("\n\nAfter deleting\n\n");
		
		tree.delete(4);
		System.out.println("\n\nAfter deleting\n\n");
		tree.print();
		
	}

}
