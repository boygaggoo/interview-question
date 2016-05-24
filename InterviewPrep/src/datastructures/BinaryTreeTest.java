package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void test() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(11);

		assertEquals(true, bt.lookup(11));
	}
	@Test
	public void sizeTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(11);
		bt.insert(4);

		assertEquals(4, bt.size());
	}
	@Test
	public void depthTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
	
	

		assertEquals(2, bt.depth());
	}
	@Test
	public void minValueTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
	
	

		assertEquals(1, bt.minValue());
	}
	
	@Test
	public void maxValueTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
	
	

		assertEquals(20, bt.maxValue());
	}
	@Test
	public void printordersTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
//		bt.print("inorder");
		bt.print("postorder");
//		bt.print("preorder");
	}
	@Test
	public void hasPathSumTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		assertEquals(true, bt.hasPathSum(14));
		
	}
	@Test
	public void hasPrintPathTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		bt.printPaths();
	}
  @Test
	public void mirror() {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		
		bt.printPaths();
		bt.mirror();
		bt.printPaths();
	}
	@Test
	public void doubleTreeTest() {
		BinaryTree bt=new BinaryTree();
		bt.insert(5);
		bt.insert(2);
		bt.insert(1);
//	   bt.print("inorder");
	   bt.doubleTree();
	   bt.print("inorder");
	}
	
	@Test
	public void isBSTTest(){
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		
	
		
		assertEquals(true, bt.isBST());
	}
	@Test
	public void isBSTEfficientTest(){
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		assertEquals(true, bt.isBST2());
	}
	@Test
	public void isPresentTest(){
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		bt.print("inorder");
		assertEquals(true, bt.isPesent(10));
		assertEquals(true, bt.isPesent(22));
	}
	@Test
	public void pathWithSpecifiedSumTest(){
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(20);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		bt.pathWithSpecifiedSum(34);
		
	}
	@Test
	public void LCATest(){
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(4);
		bt.insert(19);
		bt.insert(1);
		bt.insert(2);
		bt.insert(22);
		bt.pathWithSpecifiedSum(34);
		
	}

}
